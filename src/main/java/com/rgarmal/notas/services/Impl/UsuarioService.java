package com.rgarmal.notas.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgarmal.notas.model.Usuario;
import com.rgarmal.notas.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repository;

    public Usuario findByusername(String username, String password) {
        return repository.findByNameAndPassword(username, password);
    }
}
