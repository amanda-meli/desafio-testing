package com.example.desafio_quality.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Immobile {
    //Adicionar as validações

    private String name;
    private String neighborhood;
    private List<Room> listOfRooms;
}
