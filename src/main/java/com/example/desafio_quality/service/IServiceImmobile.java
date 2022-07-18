package com.example.desafio_quality.service;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.model.Immobile;

/***
 * Interface para base da camda de service
 */
public interface IServiceImmobile {

    /***
     * Função para calcular os dados da casa.
     * @param immobileDTO dados basicos de uma casa
     * @return a casa completa contendo todos os valores calculados
     */
    Immobile calculateValues(ImmobileDTO immobileDTO);
}
