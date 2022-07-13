package com.example.desafio_quality.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {
    //Adicionar as validações

    @Size(max = 45, message = "Comprimento do nome do bairro não pode exceder 45 caracteres")
    @NotBlank(message = "Nome do bairro não pode ser vazio")
    private String districtName;

    @Size(max = 13, message = " Campo valor por metro quadrado deve ter comprimento maximo de 13 digitos")
    @NotBlank(message = "Valor por metro quadrado obrigatorio")
    private double valuePerSquareMeter;
}
