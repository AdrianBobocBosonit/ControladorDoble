package com.bosonit.DobleControlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller1 {

    @Autowired
    PersonaService personaService;

    @GetMapping("/controlador1/addPersona")
    public void getPersona(@RequestHeader("nombre") String nombre, @RequestHeader("edad") int edad, @RequestHeader("poblacion") String poblacion) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Poblacion: " + poblacion);

        Persona persona = new Persona(nombre,poblacion,edad);

        personaService.setPersona(persona);
    }


}
