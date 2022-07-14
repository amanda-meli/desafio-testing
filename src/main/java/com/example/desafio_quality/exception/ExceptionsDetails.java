package com.example.desafio_quality.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class ExceptionsDetails {
    private String name;
    private String description;
}
