package com.example.desafio_quality.integration;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.mock.ImmobileDtoMock;
import com.example.desafio_quality.model.Immobile;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JsonContent;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ImmobileIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    TestRestTemplate testRestTemplate;


    @Test
    public void getImmobile(){
        String baseUrl = "http://localhost:" + port + "/immobile";
        ImmobileDtoMock mock = new ImmobileDtoMock();
        ImmobileDTO immobileDTO = mock.getImmobileDTO();

        HttpEntity<ImmobileDTO> httpEntity = new HttpEntity<>(immobileDTO);

        ResponseEntity<Immobile> response = testRestTemplate.exchange(
                baseUrl,
                HttpMethod.POST,
                httpEntity,
                Immobile.class);

        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        Assertions.assertThat(response.getBody()).isNotNull();
        Assertions.assertThat(response.getBody().getPropName()).isEqualTo(immobileDTO.getPropName());
    }

    @Test
    public void getImovel_returnStatusNotFound(){
        String baseUrl = "http://localhost:" + port + "/immobile";

        ImmobileDTO immobileDTO = ImmobileDtoMock.getImmobileDistrictNotFound();

        HttpEntity<ImmobileDTO> httpEntity = new HttpEntity<>(immobileDTO);

        ResponseEntity<Immobile> response = testRestTemplate.exchange(
                baseUrl,
                HttpMethod.POST,
                httpEntity,
                Immobile.class);

        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);


    }
}
