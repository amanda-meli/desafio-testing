package com.example.desafio_quality.model;

import com.example.desafio_quality.exception.RoomNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/***
 * Teste unitários da classe Immobile
 */
class ImmobileTest {

    private Immobile immobile;

    private District districtTest;
    private ArrayList<Room> roomsTest;

    private double totalValueTest;

    private double totalAreaTest;

    Room maxRoomTest;

    /***
     * Defini valores base para cada teste unitário
     */
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

    /***
     * Para consultar um nome
     */
    @Test
    void getPropName() {
        assertThat(immobile.getPropName()).isEqualTo("casa");
    }

    /***
     * Para consultar um bairro
     */
    @Test
    void getDistrict() {
        assertThat(immobile.getDistrict()).isEqualTo(districtTest);
    }

    /***
     * Para consultar a lista de comodos
     */
    @Test
    void getListOfRooms() {
        assertThat(immobile.getListOfRooms()).isEqualTo(roomsTest);
    }

    /***
     * Para consultar o valor total da casa
     */
    @Test
    void getTotalValue() {
        assertThat(immobile.getTotalValue()).isEqualTo(totalValueTest);
    }

    /***
     * Para consultar a area total da casa
     */
    @Test
    void getTotalArea() {
        assertThat(immobile.getTotalArea()).isEqualTo(totalAreaTest);
    }

    /***
     * Para consultar qual o maior quarto da casa
     */
    @Test
    void getMaxRoom() {
        assertThat(immobile.getMaxRoom()).isEqualTo(maxRoomTest);
    }

    /***
     * Setar novo nome
     */
    @Test
    void setPropName() {
        immobile.setPropName("Novo nome");
        assertThat(immobile.getPropName()).isEqualTo("Novo nome");
    }

    /***
     * Setar novo distrito
     */
    @Test
    void setDistrict() {
        District newDistrictTest = new District("New disctrict", 33);
        immobile.setDistrict(newDistrictTest);
        assertThat(immobile.getDistrict()).isEqualTo(newDistrictTest);
    }

    /***
     * Setar novos comodos
     */
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

    /***
     * Setar maior quarto
     */
    @Test
    void setMaxRoom() {
        Immobile newImmobileTest = new Immobile("New Test", districtTest, roomsTest);

        assertThat(newImmobileTest.getMaxRoom()).isEqualTo(maxRoomTest);
    }

    /***
     * Buscar um comodo da casa e validar o metro quadro dele
     */
    @Test
    void getTotalValuePerRoom_returnRoom_whenRoomExist() {
        Room roomFound = this.immobile.getTotalValuePerRoom("Quarto");

        assertThat(roomFound.getSquareMeter()).isEqualTo(4);
    }

    /***
     * Buscar um comodo que não existe na casa
     */
    @Test
    void getTotalValuePerRoom_throwException_whenRoomNotExist() {
        RoomNotFoundException exception = assertThrows(RoomNotFoundException.class, () -> {
            this.immobile.getTotalValuePerRoom("Não existe");
        });

        assertThat(exception.getMessage()).isEqualTo("Esse cômodo não foi encontrado.");
    }
}
