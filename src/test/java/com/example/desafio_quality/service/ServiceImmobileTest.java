package com.example.desafio_quality.service;

import com.example.desafio_quality.model.Immobile;
import com.example.desafio_quality.repository.DistrictRepo;
import mock.ImmobileDtoMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
class ServiceImmobileTest {

    @InjectMocks
    ServiceImmobile service;

   @Mock
    DistrictRepo repo;

    @BeforeEach
    public void beforeEach() {
        MockitoAnnotations.initMocks(this);
        this.service = new ServiceImmobile();
    }

    @Test
    void calculateValues() {

        ImmobileDtoMock mock = new ImmobileDtoMock();

        BDDMockito.when(repo.getByName(ArgumentMatchers.any(String.class)))
                .thenReturn(ImmobileDtoMock.getByName("Bairro1"));

      Immobile immobile = service.calculateValues(mock.getImmobileDTO());

       service.calculateValues(mock.getImmobileDTO());




    }
}
