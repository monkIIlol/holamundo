package com.holamundo.cl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holamundo.cl.model.Persona;
import com.holamundo.cl.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired

    private PersonaRepository personaRepository;

    public Persona guardar(Persona persona) {
        return personaRepository.create(persona);

    }
}
