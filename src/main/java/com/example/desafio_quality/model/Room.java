package com.example.desafio_quality.model;

import lombok.*;

import javax.validation.constraints.*;


public class Room {

    public Room(int id, String roomName, double width, double length) {
        this.id = id;
        this.roomName = roomName;
        this.width = width;
        setLength(length);
    }

    @Getter
    @Setter
    private int id;

    @Getter
    @NotBlank(message = "Nome do comodo obrigatorio")
    @Pattern(regexp = "([AZ]|[0-9])[\\s|[0-9]|AZ|az|ñ|ó|í|á|é|ú|Á|Ó|É| Í|Ú]*$",
            message = "Nome do comodo deve começar com a letra maiuscula")
    @Size(max = 30, message = "O comprimento do nome do comodo não pode exceder 30 caracteres")
    private String roomName;

    @Getter
    @NotBlank(message = "Campo largura obrigatorio")
    @Max(value = 25, message = "Largura maxima permitida de 25 metros")
    private double width;

    @Getter
    @NotBlank
    @Max(value = 33, message = "Comprimento maxima permitida de 33 metros")
    private double length;

    @Getter
    private double squareMeter;

    public void setWidth(double width) {
        this.width = width;

        this.squareMeter = getWidth() * getLength();
    }

    public void setLength(double length) {
        this.length = length;

        this.squareMeter = getWidth() * getLength();
    }

}
