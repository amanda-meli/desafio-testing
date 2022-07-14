package com.example.desafio_quality.model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class ImmobileTest {

    private Immobile immobile;

    private District districtTest;
    private ArrayList<Room> roomsTest;

    private double totalValueTest;

    private double totalAreaTest;

    Room maxRoomTest;

    @BeforeEach
    void setup() {
        districtTest = new District("Sao tests", 22);

        roomsTest = new ArrayList<>();
        roomsTest.add( new Room(0, "Quarto", 2, 2));
        roomsTest.add( new Room(0, "Quarto1", 3, 3));

        maxRoomTest = new Room(0, "Quarto2", 4, 4);
        roomsTest.add( maxRoomTest);

        totalValueTest = 638;

        totalAreaTest = 29;

        immobile = new Immobile("casa", districtTest, roomsTest);
    }

    @Test
    void getPropName() {
        assertThat(immobile.getPropName()).isEqualTo("casa");
    }

    @Test
    void getDistrict() {
        assertThat(immobile.getDistrict()).isEqualTo(districtTest);
    }

    @Test
    void getListOfRooms() {
        assertThat(immobile.getListOfRooms()).isEqualTo(roomsTest);
    }

    @Test
    void getTotalValue() {
        assertThat(immobile.getTotalValue()).isEqualTo(totalValueTest);
    }

    @Test
    void getTotalArea() {
        assertThat(immobile.getTotalArea()).isEqualTo(totalAreaTest);
    }

    @Test
    void getMaxRoom() {
        assertThat(immobile.getMaxRoom()).isEqualTo(maxRoomTest);
    }

    @Test
    void setPropName() {
        immobile.setPropName("Novo nome");
        assertThat(immobile.getPropName()).isEqualTo("Novo nome");
    }

    @Test
    void setDistrict() {
        District newDistrictTest = new District("New disctrict", 33);
        immobile.setDistrict(newDistrictTest);
        assertThat(immobile.getDistrict()).isEqualTo(newDistrictTest);
    }

    @Test
    void setListOfRooms() {
         ArrayList<Room> newRoomsTest = new ArrayList<>();
         newRoomsTest.add( new Room(1, "Novo Quarto", 2, 2));
         newRoomsTest.add( new Room(3, "Novo Quarto1", 2, 2));

        immobile.setListOfRooms(newRoomsTest);

        assertThat(immobile.getListOfRooms()).isEqualTo(newRoomsTest);
        assertThat(immobile.getTotalArea()).isEqualTo(8);
        assertThat(immobile.getTotalValue()).isEqualTo(176);
    }

    @Test
    void setMaxRoom() {
        Immobile newImmobileTest = new Immobile("New Test", districtTest, roomsTest);

        assertThat(newImmobileTest.getMaxRoom()).isEqualTo(maxRoomTest);
    }

}
