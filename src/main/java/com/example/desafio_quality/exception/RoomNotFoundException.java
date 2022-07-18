package com.example.desafio_quality.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/***
 * Exceção lançada quando algum room (comodo) nao for encontrado em uma casa
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class RoomNotFoundException extends RuntimeException {

    public RoomNotFoundException(String msg) {
        super(msg);
    }
}
