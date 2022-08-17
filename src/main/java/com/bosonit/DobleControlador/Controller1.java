package com.bosonit.DobleControlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Controller1 {

    @Autowired
    PersonaService personaService;

    @Autowired
    CiudadService ciudadService;



    @Autowired
    @Qualifier("creadAlinicioCiudades")
    List<Ciudad> creadAlinicioCiudades;



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

    @Autowired
    @Qualifier("beanuno")
    Persona bean1;

    @Autowired
    @Qualifier("beandos")
    Persona bean2;

    @Autowired
    @Qualifier("beantres")
    Persona bean3;

    @GetMapping("/controlador/bean/{beanNumber}")
    public Persona bean1(@PathVariable String beanNumber) {
        System.out.println(beanNumber);
        if (beanNumber.equals("1")) {
            System.out.println(bean1);
            return bean1;
        }
        if (beanNumber.equals("2")) {
            System.out.println(bean2);
            return bean2;
        }
        if (beanNumber.equals("3")) {
            System.out.println(bean3);
            return bean3;
        } else {
            Persona person = new Persona();
            return person;
        }
    }
}
