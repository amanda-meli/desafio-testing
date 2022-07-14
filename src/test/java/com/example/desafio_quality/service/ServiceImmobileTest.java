package com.example.desafio_quality.service;

import com.example.desafio_quality.model.Immobile;
import com.example.desafio_quality.repository.DistrictRepo;
import com.example.desafio_quality.mock.ImmobileDtoMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class ServiceImmobileTest {

    @InjectMocks
    ServiceImmobile service;

   @Mock
    DistrictRepo repo;

    @BeforeEach
    public void beforeEach() {
        BDDMockito.when(repo.getByName(ArgumentMatchers.any(String.class)))
                .thenReturn(ImmobileDtoMock.getByName("Bairro1"));
    }

    @Test
    void calculateValues() {
        ImmobileDtoMock mock = new ImmobileDtoMock();
        Immobile immobile = service.calculateValues(mock.getImmobileDTO());

    }
}
