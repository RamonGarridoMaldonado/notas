package com.rgarmal.notas.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rgarmal.notas.model.Asignatura;
import com.rgarmal.notas.services.AsignaturaServices;

@RestController
public class AsignaturaController {
    @Autowired
    AsignaturaServices service;

    @GetMapping("/asignaturas")
    List<Asignatura> all(){
        return service.findAll();
    }

    @GetMapping("/asignaturas/{codigo}")
    Asignatura findNota(@PathVariable int codigo){
        return service.findById(codigo);
    }

    @DeleteMapping("/asignaturas/{codigo}")
    void deleteNota(@PathVariable int codigo){
        service.deleteById(codigo);
    }

    @PostMapping("/asignaturas")
    Asignatura guardar(@RequestBody Asignatura asignatura){
        return service.save(asignatura);
    }

    @PutMapping("/asignaturas/{codigo}")
    Asignatura actualizar(@PathVariable int codigo, @RequestBody Asignatura asignatura){
        return service.update(codigo, asignatura);
    }
}
