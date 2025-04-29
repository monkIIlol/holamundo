package com.holamundo.cl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.holamundo.cl.model.Persona;
import com.holamundo.cl.service.PersonaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RequestMapping("/api/personas")
@RestController

public class PersonaController {

    private PersonaService personaService;
    
    @GetMapping
    public String saludar() {
        return "VAmooooooo";
    }
    
    @PostMapping()
    public Persona crearPersona(@RequestBody Persona persona) {

        
        return persona;
    }
    
}
