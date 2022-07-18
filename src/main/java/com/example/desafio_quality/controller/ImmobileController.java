package com.example.desafio_quality.controller;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.model.Immobile;
import com.example.desafio_quality.service.IServiceImmobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/immobile")
public class ImmobileController {

    @Autowired
    IServiceImmobile service;

    /***
     * Função responsável por criar o end-point onde erá acontecer o calculo
     * @param immobileDTO dados do imóvel para que calcular
     * @return imovel por completo com todos os valores e dimensões calculadas
     */
    @PostMapping
    public ResponseEntity<Immobile> getImmobile(@RequestBody @Valid ImmobileDTO immobileDTO){
        return new ResponseEntity<>(service.calculateValues(immobileDTO), HttpStatus.OK);

    }

}
