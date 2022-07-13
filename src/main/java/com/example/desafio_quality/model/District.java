package com.example.desafio_quality.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {
    //Adicionar as validações

    private String name;
    private double valuePerSquareMeter;
}
