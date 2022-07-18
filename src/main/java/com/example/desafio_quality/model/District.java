package com.example.desafio_quality.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/***
 * Classe para mapear bairro
 */
@Getter
@Setter
@AllArgsConstructor
public class District {
    //Adicionar as validações

    @NotBlank(message = "O nome do bairro é obrigatório.")
    @Size(max = 45, message = "Comprimento do nome do bairro não pode exceder 45 caracteres.")
    private String districtName;

    @NotBlank(message = "O valor por metro quadrado obrigatório.")
    @Size(max = 13, message = "O campo valor por metro quadrado deve ter comprimento máximo de 13 dígitos.")
    private double valuePerSquareMeter;
}
