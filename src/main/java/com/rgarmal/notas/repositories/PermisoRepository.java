package com.rgarmal.notas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rgarmal.notas.model.Permiso;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, Long>{
    
}

