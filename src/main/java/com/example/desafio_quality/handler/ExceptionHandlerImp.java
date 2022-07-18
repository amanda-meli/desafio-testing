package com.example.desafio_quality.handler;

import com.example.desafio_quality.exception.DistrictNotFoundException;
import com.example.desafio_quality.exception.ExceptionsDetails;
import com.example.desafio_quality.exception.RoomNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerImp {

    /***
     * Controlador da exceção DistrictNotFoundException
     * @param ex uma exceça lançado no throw
     * @return um response entity para o client conectado na api
     */
    @ExceptionHandler(DistrictNotFoundException.class)
    ResponseEntity<ExceptionsDetails> districtNotFound(DistrictNotFoundException ex) {
        return new ResponseEntity<>(ExceptionsDetails.builder()
                .name("Bairro não encontrado.")
                .description(ex.getMessage())
                .build(), HttpStatus.NOT_FOUND);
    }

    /***
     * Controlador da exceção RoomNotFoundException
     * @param ex uma exceça lançado no throw
     * @return um response entity para o client conectado na api
     */
    @ExceptionHandler(RoomNotFoundException.class)
    ResponseEntity<ExceptionsDetails> roomNotFound(RoomNotFoundException ex) {
        return new ResponseEntity<>(ExceptionsDetails.builder()
                .name("Cômodo não encontrado.")
                .description(ex.getMessage())
                .build(), HttpStatus.NOT_FOUND);
    }
}
