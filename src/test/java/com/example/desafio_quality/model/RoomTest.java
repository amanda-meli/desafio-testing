package com.example.desafio_quality.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    private Room room;

    @Test
    void setWidth() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getSquareMeter(), room.getWidth() * room.getLength());

        room.setWidth(4);
        Assertions.assertEquals(room.getWidth(), 4);
        Assertions.assertEquals(room.getSquareMeter(), room.getWidth() * room.getLength());

    }

    @Test
    void setLength() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getSquareMeter(), room.getWidth() * room.getLength());

        room.setLength(4);
        Assertions.assertEquals(room.getLength(), 4);
        Assertions.assertEquals(room.getSquareMeter(), room.getWidth() * room.getLength());
    }

    @Test
    void setId() {
        room = new Room(0, "Quarto", 2, 2);
        room.setId(1);
        Assertions.assertEquals(room.getId(), 1);
    }

    @Test
    void getId() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getId(), 0);
    }

    @Test
    void getRoomName() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getRoomName(), "Quarto");
    }

    @Test
    void getWidth() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getWidth(), 2);
    }

    @Test
    void getLength() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getLength(), 2);
    }

    @Test
    void getSquareMeter() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getSquareMeter(), room.getWidth() * room.getLength());
    }

    @Test
    void noConstructor(){
        room = new Room();
        Assertions.assertEquals(room.getId(), 0);
    }
}
