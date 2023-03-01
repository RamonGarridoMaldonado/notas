package com.rgarmal.notas.repositories;

import org.springframework.stereotype.Repository;

import com.rgarmal.notas.model.Notas;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NotasRepository extends JpaRepository<Notas, Integer>{
    List<Notas> findByTituloContainingAndFechaGreaterThan(String titulo, Date fecha);
}
