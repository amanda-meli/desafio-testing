package com.example.desafio_quality.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DistrictTest {

    private District district;

    @BeforeEach
    void setup(){
        district = new District("Test", 10);
    }

    @Test
    void getDistrictName() {
        String name = district.getDistrictName();
        Assertions.assertThat(name).isEqualTo("Test");
    }

    @Test
    void getValuePerSquareMeter() {
        double value = district.getValuePerSquareMeter();
        Assertions.assertThat(value).isEqualTo(10);
    }

    @Test
    void setDistrictName() {
        district.setDistrictName("New name");
        Assertions.assertThat(district.getDistrictName()).isEqualTo("New name");
    }

    @Test
    void setValuePerSquareMeter() {
        district.setValuePerSquareMeter(11);
        Assertions.assertThat(district.getValuePerSquareMeter()).isEqualTo(11);
    }
}
