package com.bosonit.DobleControlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

    @Autowired
    PersonaService personaService;

    @PostMapping("controlador2/getPersona")
    public Persona getPersona() {

        Persona persona = personaService.getPersona();
        persona.setEdad(persona.getEdad()*2);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getPoblacion());

        return persona;
    }
}
