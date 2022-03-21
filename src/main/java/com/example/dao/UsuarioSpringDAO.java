package com.example.dao;

import com.example.domain.UsuarioSpring;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioSpringDAO extends JpaRepository<UsuarioSpring, Long> {
    UsuarioSpring findByUsername(String username);
    
}
