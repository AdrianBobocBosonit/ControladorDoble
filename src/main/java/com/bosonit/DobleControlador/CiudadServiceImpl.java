package com.bosonit.DobleControlador;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadServiceImpl implements CiudadService{

    List<Ciudad> listaCiudades = new ArrayList<>();

    @Bean
    @Qualifier("creadAlinicioCiudades")
    public List<Ciudad> creadAlinicioCiudades() {

        Ciudad ciudad1 = new Ciudad("Pekin",1234567890);
        Ciudad ciudad2 = new Ciudad("Londres", 1234567);
        Ciudad ciudad3 = new Ciudad("Toledo", 123456);

        listaCiudades.add(ciudad1);
        listaCiudades.add(ciudad2);
        listaCiudades.add(ciudad3);

        return listaCiudades;
    }

    @Override
    public void addCiudad(Ciudad ciudad) {
        listaCiudades.add(ciudad);
    }

    @Override
    public List<Ciudad> getCiudad() {
        return listaCiudades;
    }
}
