package com.example.desafio_quality.dto;

import com.example.desafio_quality.model.District;
import com.example.desafio_quality.model.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImmobileDTO {

    private String propName;
    private String district;
    private ArrayList<Room> listOfRooms;

}
