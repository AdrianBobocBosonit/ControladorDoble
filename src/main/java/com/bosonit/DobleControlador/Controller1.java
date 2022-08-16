package com.bosonit.DobleControlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller1 {

    @Autowired
    PersonaService personaService;

    @Autowired
    CiudadService ciudadService;



    @GetMapping("/controlador1/addPersona")
    public void getPersona(@RequestHeader("nombre") String nombre, @RequestHeader("edad") int edad, @RequestHeader("poblacion") String poblacion) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Poblacion: " + poblacion);

        Persona persona = new Persona(nombre,poblacion,edad);

        personaService.setPersona(persona);
    }

    @PostMapping("/controlador1/addCiudad")
    public void addCiudad(@RequestBody Ciudad ciudad) {
        System.out.println(ciudad.getNombre());
        System.out.println(ciudad.getNumeroHabitantes());
        ciudadService.addCiudad(ciudad);
    }

    @GetMapping("/controlador1/getCiudad")
    public List<Ciudad> getCiudad() {
        return ciudadService.getCiudad();
    }
}
