package com.example.desafio_quality.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/***
 * Classe responsável por detralhar cada exceção criada na API
 */
@Getter @Setter
@Builder
public class ExceptionsDetails {
    private String name;
    private String description;
}
