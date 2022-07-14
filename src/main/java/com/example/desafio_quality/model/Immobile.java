package com.example.desafio_quality.model;

import com.example.desafio_quality.exception.RoomNotFoundException;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;

public class Immobile {
    //Adicionar as validações

    @Getter
    @Setter
    @NotBlank(message = "O nome do imóvel é obrigatório.")
    @Pattern(regexp = "([AZ]|[0-9])[\\s|[0-9]|AZ|az|ñ|ó|í|á|é|ú|Á|Ó|É| Í|Ú]*$",
            message = "O nome do imóvel deve começar com letra maiúscula.")
    @Size(max = 30, message = "O comprimento do nome do imóvel não pode exceder 30 caracteres.")
    private String propName;

    @Getter
    @Setter
    private District district;

    @Getter
    @Setter
    private ArrayList<@Valid Room> listOfRooms;

    @Getter
    private double totalValue;

    @Getter
    private double totalArea;

    @Getter
    private Room maxRoom;

    public Immobile(String name, District district, ArrayList<Room> listOfRooms) {
        this.propName = name;
        this.district = district;
        this.listOfRooms = listOfRooms;
        defineTotalValue();
        setMaxRoom();
    }

    public void setListOfRooms(ArrayList<Room> listOfRooms) {
        this.listOfRooms = listOfRooms;
        defineTotalValue();
        setMaxRoom();
    }

    public Room getTotalValuePerRoom(String roomName) {
        for (Room r : listOfRooms) {
            if (r.getRoomName().equals(roomName)) {
                return r;
            }
        }

        throw new RoomNotFoundException("Esse cômodo não foi encontrado.");
    }

    private void defineTotalValue() {
        double totalSquareMeter = 0;

        //estou percorrendo a lista e descobrindo o valor total de metro quadrados da ca
        for(Room r : listOfRooms) {
            totalSquareMeter += r.getSquareMeter();
        }

        //definindo o valor total da casa, é a quantidade de metro quadrados

        this.totalValue = totalSquareMeter * district.getValuePerSquareMeter();
        this.totalArea = totalSquareMeter;
    }

    private void setMaxRoom() {
        double currentMaxRoom = 0;

        for (Room r : this.listOfRooms) {
            if (r.getSquareMeter() > currentMaxRoom) {
                this.maxRoom = r;
                currentMaxRoom = r.getSquareMeter();
            }
        }
    }

}
