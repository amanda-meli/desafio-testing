package com.example.desafio_quality.mock;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.model.District;
import com.example.desafio_quality.model.Room;
import lombok.Getter;

import java.util.ArrayList;


public class ImmobileDtoMock {

    @Getter
    private ImmobileDTO immobileDTO;

    @Getter
    private Room maxRoom;


    public ImmobileDtoMock() {

        this.immobileDTO = new ImmobileDTO();

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(0, "Quarto", 2, 2));
        maxRoom = new Room(0, "Quarto1", 3, 3);
        rooms.add(maxRoom);

        immobileDTO.setListOfRooms(rooms);
        immobileDTO.setDistrict("São jose");
        immobileDTO.setPropName("Minha casa");

    }

    public static District getByName(String name) {
        return new District(name, 10);
    }

    public static double getTotalArea() {
        return 13;
    }

    public static double getTotalValue() {
        return 130;
    }


}
