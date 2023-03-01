package com.rgarmal.notas.services.Impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgarmal.notas.model.Notas;
import com.rgarmal.notas.repositories.NotasRepository;
import com.rgarmal.notas.services.NotasServices;

@Service
public class NotasServicesImpl implements NotasServices {

    @Autowired
    NotasRepository repository;

    @Override
    public List<Notas> findAll() {
        return repository.findAll();

    }

    @Override
    public Notas findById(int codigo) {
        Optional<Notas> findById = repository.findById(codigo);
        if (findById != null) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Notas save(Notas notas) {
        return repository.save(notas);

    }

    @Override
    public void update(int codigo, Notas notas) {
        this.findById(codigo);
        notas.setCodigo(codigo);
        repository.save(notas);   
        
    }

    @Override
    public void deleteById(int codigo) {
        repository.deleteById(codigo);          
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public List<Notas> findByTituloFecha(String titulo, Date fecha) {
        List<Notas> notasCriteria = repository.findByTituloContainingAndFechaGreaterThan(titulo, fecha);
        return notasCriteria;
    }
    
}
