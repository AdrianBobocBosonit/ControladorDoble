package com.bosonit.DobleControlador;

import org.springframework.stereotype.Service;


@Service
public class PersonaServiceImpl implements PersonaService{

    Persona person = new Persona();

    @Override
    public void setPersona(Persona persona) {
        person.setNombre(persona.getNombre());
        person.setEdad(persona.getEdad()*2);
        person.setPoblacion(persona.getPoblacion());
    }

    @Override
    public Persona getPersona() {
        return person;
    }
}
