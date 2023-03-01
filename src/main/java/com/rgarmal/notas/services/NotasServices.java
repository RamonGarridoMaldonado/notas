package com.rgarmal.notas.services;

import java.util.Date;
import java.util.List;

import com.rgarmal.notas.model.Notas;

public interface NotasServices {
    public List<Notas> findAll();
    public Notas findById(int codigo);
    public List<Notas> findByTituloFecha(String titulo, Date fecha);
    public Notas save(Notas notas);
    public void update(int id,Notas notas);
    public void deleteById(int codigo);
    public void deleteAll();
}
