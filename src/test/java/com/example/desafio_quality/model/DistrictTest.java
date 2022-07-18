package com.example.desafio_quality.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/***
 * Testes unitarios da classe District
 */
class DistrictTest {

    private District district;

    /***
     * Criar m district para casa test
     */
    @BeforeEach
    void setup(){
        district = new District("Test", 10);
    }

    /***
     * Se esta retornando o nome certo
     */
    @Test
    void getDistrictName() {
        String name = district.getDistrictName();
        Assertions.assertThat(name).isEqualTo("Test");
    }
    /***
     * Se esta retornando o metro quadrado certo
     */
    @Test
    void getValuePerSquareMeter() {
        double value = district.getValuePerSquareMeter();
        Assertions.assertThat(value).isEqualTo(10);
    }

    /***
     * Se esta definindo o nome certo
     */
    @Test
    void setDistrictName() {
        district.setDistrictName("New name");
        Assertions.assertThat(district.getDistrictName()).isEqualTo("New name");
    }

    /***
     * Se esta definindo um metro quadrado certo
     */
    @Test
    void setValuePerSquareMeter() {
        district.setValuePerSquareMeter(11);
        Assertions.assertThat(district.getValuePerSquareMeter()).isEqualTo(11);
    }
}
