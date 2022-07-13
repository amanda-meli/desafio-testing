package com.example.desafio_quality.service;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.model.Immobile;

public interface IServiceImmobile {

    Immobile calculateValues(ImmobileDTO immobileDTO);
}
