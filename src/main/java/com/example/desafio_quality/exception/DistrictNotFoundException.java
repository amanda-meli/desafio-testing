package com.example.desafio_quality.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/***
 * Exceção lançada quando algum district (bairro) nao for encontrado no banco de dados
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class DistrictNotFoundException extends RuntimeException {

    public DistrictNotFoundException (String msg){
        super(msg);
    }
}
