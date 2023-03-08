package com.rgarmal.notas.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rgarmal.notas.model.Alumno;
import com.rgarmal.notas.repositories.AlumnoRespository;
import com.rgarmal.notas.services.AlumnoServices;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoServices {

    @Autowired
    AlumnoRespository repository;

    @Override
    public List<Alumno> findAll() {
        return repository.findAll();
    }

    @Override
    public Alumno findById(int codigo) {
        Optional<Alumno> findById = repository.findById(codigo);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Alumno save(Alumno alumno) {
        return repository.save(alumno);
    }

    @Override
    public Alumno update(int codigo, Alumno alumno) {
        Alumno findById = this.findById(codigo);
        if(findById != null){

            alumno.setCodigo(findById.getCodigo());

            return repository.save(alumno);
            
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
    
}
