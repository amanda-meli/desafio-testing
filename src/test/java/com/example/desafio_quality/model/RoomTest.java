package com.example.desafio_quality.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/***
 * Teste unitários da classe room
 */
class RoomTest {

    private Room room;

    /***
     * definir nova largura
     */
    @Test
    void setWidth() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getSquareMeter(), room.getWidth() * room.getLength());

        room.setWidth(4);
        Assertions.assertEquals(room.getWidth(), 4);
        Assertions.assertEquals(room.getSquareMeter(), room.getWidth() * room.getLength());
    }

    /***
     * definir novo comprimento
     */
    @Test
    void setLength() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getSquareMeter(), room.getWidth() * room.getLength());

        room.setLength(4);
        Assertions.assertEquals(room.getLength(), 4);
        Assertions.assertEquals(room.getSquareMeter(), room.getWidth() * room.getLength());
    }

    /***
     * definir novo identificador
     */
    @Test
    void setId() {
        room = new Room(0, "Quarto", 2, 2);
        room.setId(1);
        Assertions.assertEquals(room.getId(), 1);
    }

    /***
     * consultar identificador
     */
    @Test
    void getId() {
        room = new Room(0, "Quarto", 2, 2);
        int idTest = room.getId();
        Assertions.assertEquals(room.getId(), idTest);
    }

    /***
     * consultar nome
     */
    @Test
    void getRoomName() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getRoomName(), "Quarto");
    }

    /***
     * setar nome
     */
    @Test
    void setRoomName() {
        room = new Room(0, "Quarto", 2, 2);
        room.setRoomName("New Name");
        Assertions.assertEquals(room.getRoomName(), "New Name");
    }

    /***
     * Setar largura
     */
    @Test
    void getWidth() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getWidth(), 2);
    }

    /***
     * setar comprimento
     */
    @Test
    void getLength() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getLength(), 2);
    }

    /***
     * consultar metro quadrado
     */
    @Test
    void getSquareMeter() {
        room = new Room(0, "Quarto", 2, 2);
        Assertions.assertEquals(room.getSquareMeter(), room.getWidth() * room.getLength());
    }

    /***
     * construtor vazio
     */
    @Test
    void noConstructor(){
        room = new Room();
        Assertions.assertEquals(room.getId(), 0);
    }

}
