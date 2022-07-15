package com.example.desafio_quality.integration;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.mock.ImmobileDtoMock;
import com.example.desafio_quality.model.Immobile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ImmobileIntegration {

    @LocalServerPort
    private int port;

    @Autowired
    TestRestTemplate testRestTemplate;


    @Test
    public void getImmobile(){
        ImmobileDtoMock mock = new ImmobileDtoMock();
        ImmobileDTO immobileDTO = mock.getImmobileDTO();
        String baseUrl = "http://localhost:" + port + "/immobile";
        HttpEntity<ImmobileDTO> httpEntity = new HttpEntity<>(immobileDTO);

        ResponseEntity<ImmobileDTO> response = testRestTemplate.exchange(baseUrl,
                HttpMethod.GET, httpEntity, ImmobileDTO.class);

        System.out.println(response);
    }

}
