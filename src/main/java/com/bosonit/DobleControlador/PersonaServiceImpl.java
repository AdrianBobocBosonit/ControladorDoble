package com.bosonit.DobleControlador;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public class PersonaServiceImpl implements PersonaService{

    Persona person = new Persona();

    @Override
    public void setPersona(Persona persona) {
        /*person.setNombre(persona.getNombre());
        person.setEdad(persona.getEdad()*2);
        person.setPoblacion(persona.getPoblacion());*/

        //El bloque de lineas comentadas de arriba hace lo mismo que la linea de abajo

        person = persona;
    }

    @Override
    public Persona getPersona() {
        return person;
    }

    @Bean
    @Qualifier("beanuno")
    public Persona bean1() {
        Persona persona = new Persona("Quique","Madagascar",10);
        return persona;
    }

    @Bean
    @Qualifier("beandos")
    public Persona bean2() {
        Persona persona = new Persona("Pepe","Madrid",20);
        return persona;
    }

    @Bean
    @Qualifier("beantres")
    public Persona bean3() {
        Persona persona = new Persona("Albaricoque","Barcelona",30);
        return persona;
    }
}
