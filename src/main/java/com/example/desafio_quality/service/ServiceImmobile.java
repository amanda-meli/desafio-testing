package com.example.desafio_quality.service;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.exception.DistrictNotFoundException;
import com.example.desafio_quality.model.District;
import com.example.desafio_quality.model.Immobile;
import com.example.desafio_quality.repository.DistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * Implementação da classe base da camada de service
 */
@Service
public class ServiceImmobile implements IServiceImmobile{

    @Autowired
    private DistrictRepo repo;

    /***
     * Função para calcular os dados da casa.
     * @param immobileDTO dados basicos de uma casa
     * @return a casa completa contendo todos os valores calculados
     */
    public Immobile calculateValues(ImmobileDTO immobileDTO){

        District dist = repo.getByName(immobileDTO.getDistrict());

        if (dist == null) {
            throw new DistrictNotFoundException("Esse bairro não foi encontrado.");
        }

        return new Immobile(immobileDTO.getPropName(), dist, immobileDTO.getListOfRooms());
    }
}
