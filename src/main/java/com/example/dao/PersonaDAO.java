package com.example.dao;

import com.example.domain.Persona;
import org.springframework.data.repository.CrudRepository;


public interface PersonaDAO extends CrudRepository<Persona, Long> {
    
}
