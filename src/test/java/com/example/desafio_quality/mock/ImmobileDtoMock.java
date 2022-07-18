package com.example.desafio_quality.mock;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.model.District;
import com.example.desafio_quality.model.Room;
import lombok.Getter;

import java.util.ArrayList;

/***
 * Classe responsável por criar um mock da classe immobleDTo e classes agregadas
 */
public class ImmobileDtoMock {

    @Getter
    private ImmobileDTO immobileDTO;

    @Getter
    private Room maxRoom;


    /***
     * Construtor responsável por instanciar os atributos mocados
     */
    public ImmobileDtoMock() {

        this.immobileDTO = new ImmobileDTO();

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(0, "Quarto", 2, 2));
        maxRoom = new Room(0, "Quarto1", 3, 3);
        rooms.add(maxRoom);

        immobileDTO.setListOfRooms(rooms);
        immobileDTO.setDistrict("Sao jose");
        immobileDTO.setPropName("Minha casa");
    }

    /***
     * Retornar um bairro com o nome do parametro
     * @param name nome do bairro
     * @return bairro
     */
    public static District getByName(String name) {
        return new District(name, 10);
    }

    /***
     * Retorna uma casa nova
     * @return
     */
    public static ImmobileDTO getImmobileDistrictNotFound() {
        return new ImmobileDTO("Casa Dois Andares", "Ribeirão do Lipa", new ArrayList<Room>());
    }

    /***
     * simula a area da casa
     * @return valor
     */
    public static double getTotalArea() {
        return 13;
    }

    /***
     * simula o valor da casa
     * @return valor
     */
    public static double getTotalValue() {
        return 130;
    }

    /***
     * Para um casa em um bairro que não existe
     * @return bairro
     */
    public static ImmobileDTO getDistrictNotFound() {
        ImmobileDTO immobile = new ImmobileDTO();

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(0, "Quarto", 2, 2));
        rooms.add(new Room(0, "Quarto1", 3, 3));

        immobile.setListOfRooms(rooms);
        immobile.setDistrict("Bairrinho");
        immobile.setPropName("Minha casa");

        return immobile;
    }
}
