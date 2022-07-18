package com.example.desafio_quality.controller;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.mock.ImmobileDtoMock;
import com.example.desafio_quality.mock.ImmobileMock;
import com.example.desafio_quality.model.Immobile;
import com.example.desafio_quality.service.IServiceImmobile;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;


import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness =  Strictness.LENIENT)

/***
 * Testes unitários da camada de controle
 */
class ImmobileControllerTest {

    @InjectMocks
    private ImmobileController immobileController;

    @Mock
    IServiceImmobile immobileService;

    /***
     * verifica se o controle está respondendo as chamada na api corretamente
     */
    @Test
    void getImmobile() {

        BDDMockito.when(immobileService.calculateValues(ArgumentMatchers.any(ImmobileDTO.class)))
                .thenReturn(ImmobileMock.getImmobile());
        ImmobileDtoMock immobileDtoMock = new ImmobileDtoMock();
        ResponseEntity<Immobile> response = immobileController.getImmobile(immobileDtoMock.getImmobileDTO());

        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        verify(immobileService, atLeastOnce()).calculateValues(immobileDtoMock.getImmobileDTO());
    }
}
