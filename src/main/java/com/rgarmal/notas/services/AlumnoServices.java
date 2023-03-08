package com.rgarmal.notas.services;

import java.util.List;

import com.rgarmal.notas.model.Alumno;

public interface AlumnoServices {
    public List<Alumno> findAll();

    public Alumno findById(int codigo);

    public Alumno save(Alumno alumno);

    public Alumno update(int codigo, Alumno alumno);

    public void deleteById(int id);
}
