package com.example.desafio_quality.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Getter @Setter
    private int id;

    @Getter
    private double width;

    @Getter
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
