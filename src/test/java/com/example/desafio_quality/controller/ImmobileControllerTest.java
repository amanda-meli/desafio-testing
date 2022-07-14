package com.example.desafio_quality.controller;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.mock.ImmobileDtoMock;
import com.example.desafio_quality.model.Immobile;
import com.example.desafio_quality.service.IServiceImmobile;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class ImmobileControllerTest {

    @InjectMocks
    private ImmobileController immobileController;

    @Mock
    IServiceImmobile immobileService;

    @Test
    void getImmobile() {
        ImmobileDtoMock immobileDtoMock = new ImmobileDtoMock();
        ResponseEntity<Immobile> response = immobileController.getImmobile(immobileDtoMock.getImmobileDTO());



    }
}
