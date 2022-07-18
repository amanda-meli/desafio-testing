package com.example.desafio_quality.mock;

import com.example.desafio_quality.model.District;
import com.example.desafio_quality.model.Immobile;
import com.example.desafio_quality.model.Room;

import java.util.ArrayList;

/***
 * Classe para mocar uma casa
 */
public class ImmobileMock {

    /***
     * Para obter uma casa (Immobile) com os dados mocados
     * @return
     */
    public static Immobile getImmobile() {

        District district = new District("Cambuí", 15);
        ArrayList<Room> listOfRooms = new ArrayList<>();
        listOfRooms.add(new Room(1, "Quarto", 3, 4));
        listOfRooms.add(new Room(1, "Quarto1", 2, 4));
        return new Immobile("Casa1", district, listOfRooms);
    }
}
