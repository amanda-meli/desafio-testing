package com.example.desafio_quality.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
//Casa
public class Immobile {
    //Adicionar as validações


    private String name;
    private District district;
    private List<Room> listOfRooms;
    private double totalValue;

    public Immobile(String name, District district, List<Room> listOfRooms) {
        this.name = name;
        this.district = district;
        this.listOfRooms = listOfRooms;
        defineTotalValue();
    }

    private void defineTotalValue() {
        double totalSquareMeter = 0;

        //estou percorrendo a lista e descobrindo o valor total de metro quadrados da ca
        for(Room r : listOfRooms) {
            totalSquareMeter += r.getSquareMeter();
        }

        //dfinindo o valor total da casa, é a quantidade de metro quadrados
        this.setTotalValue( totalSquareMeter * district.getValuePerSquareMeter() );

    }

}
