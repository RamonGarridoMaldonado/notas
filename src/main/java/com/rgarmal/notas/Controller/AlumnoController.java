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

import com.rgarmal.notas.model.Alumno;
import com.rgarmal.notas.services.AlumnoServices;

@RestController
public class AlumnoController {
    @Autowired
    AlumnoServices service;

    @GetMapping("/alumnos")
    List<Alumno> all(){
        return service.findAll();
    }

    @GetMapping("/alumnos/{codigo}")
    Alumno findNota(@PathVariable int codigo){
        return service.findById(codigo);
    }

    @DeleteMapping("/alumnos/{codigo}")
    void deleteNota(@PathVariable int codigo){
        service.deleteById(codigo);
    }

    @PostMapping("/alumnos")
    Alumno guardar(@RequestBody Alumno alumno){
        return service.save(alumno);
    }

    @PutMapping("/alumnos/{codigo}")
    Alumno actualizar(@PathVariable int codigo, @RequestBody Alumno alumno){
        return service.update(codigo, alumno);
    }
}
