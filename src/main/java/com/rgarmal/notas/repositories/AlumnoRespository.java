package com.rgarmal.notas.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rgarmal.notas.model.Alumno;

@Repository
public interface AlumnoRespository extends JpaRepository<Alumno, Integer>{
    
}
