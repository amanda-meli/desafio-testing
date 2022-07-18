package com.example.desafio_quality.mock;

import com.example.desafio_quality.dto.ImmobileDTO;
import com.example.desafio_quality.model.District;

import java.util.HashMap;
import java.util.Map;

/***
 * criar um mock que retorna sempre os mesmos bairros (igual a classe normal)
 */
public class DistrictRepoMock {

    private Map<String, District> allDistricts;

    public DistrictRepoMock(){
        District districtAmanda = new District("Campinas", 2000);
        District districtLaura = new District("Jardim Carlos Gomes", 3000);
        District districtSavio = new District("Sao jose", 150);
        District districtMatheus = new District("Farroupilha", 1500);

        allDistricts = new HashMap<>();
        allDistricts.put(districtAmanda.getDistrictName(), districtAmanda);
        allDistricts.put(districtLaura.getDistrictName(), districtLaura);
        allDistricts.put(districtSavio.getDistrictName(), districtSavio);
        allDistricts.put(districtMatheus.getDistrictName(), districtMatheus);
    }

    public District getByName(String name){
        return allDistricts.get(name);
    }
}
