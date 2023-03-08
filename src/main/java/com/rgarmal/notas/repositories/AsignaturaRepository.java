package com.rgarmal.notas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rgarmal.notas.model.Asignatura;

@Repository
public interface AsignaturaRepository  extends JpaRepository<Asignatura, Integer>{
    
}
