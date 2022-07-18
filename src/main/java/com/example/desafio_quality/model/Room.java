package com.example.desafio_quality.model;

import lombok.*;

import javax.validation.constraints.*;

/***
 * Classe responsável por mapear os comodas da casa
 */
@NoArgsConstructor
public class Room {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    @NotBlank(message = "O nome do cômodo é obrigatorio")
    @Pattern(regexp = "([AZ]|[0-9])[\\s|[0-9]|AZ|az|ñ|ó|í|á|é|ú|Á|Ó|É| Í|Ú]*$",
            message = "O nome do cômodo deve começar com letra maiúscula.")
    @Size(max = 30, message = "O comprimento do nome do cômodo não pode exceder 30 caracteres.")
    private String roomName;

    @Getter
    @Setter
    @NotBlank(message = "Campo largura é obrigatório")
    @Max(value = 25, message = "Largura máxima permitida de 25 metros.")
    private double width;

    @Getter
    @Setter
    @NotBlank
    @Max(value = 33, message = "Comprimento máximo permitida de 33 metros.")
    private double length;

    @Getter
    private double squareMeter;

    /***
     * Reponsável por setar uma largura do comodo e consequentemente o metro quadrado
     * @param width nova largura
     */
    public void setWidth(double width) {
        this.width = width;

        this.squareMeter = getWidth() * getLength();
    }

    /***
     * Reponsável por setar um comprimento do comodo e consequentemente o metro quadrado
     * @param length novo comprimento
     */
    public void setLength(double length) {
        this.length = length;

        this.squareMeter = getWidth() * getLength();
    }

    /***
     * Construtor personalidado contendo apenas as informações importantes
     * @param id identificador
     * @param roomName nome do comodo
     * @param width largura
     * @param length comprimento
     */
    public Room(int id, String roomName, double width, double length) {
        this.id = id;
        this.roomName = roomName;
        this.width = width;
        setLength(length);
    }

}
