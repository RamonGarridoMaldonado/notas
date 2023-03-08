package com.rgarmal.notas.services;


import java.util.List;

import com.rgarmal.notas.model.Asignatura;

public interface AsignaturaServices {
    public List<Asignatura> findAll();

    public Asignatura findById(int codigo);

    public Asignatura save(Asignatura asignatura);

    public Asignatura update(int codigo, Asignatura asignatura);

    public void deleteById(int id);
}
