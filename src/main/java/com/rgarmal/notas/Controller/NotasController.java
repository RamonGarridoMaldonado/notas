package com.rgarmal.notas.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.rgarmal.notas.model.Notas;
import com.rgarmal.notas.services.NotasServices;

@RestController
public class NotasController {
    
    @Autowired
    NotasServices service;

    @GetMapping("/notas")
    List<Notas> all() {
        return service.findAll(); 
    }

    @GetMapping("/notas/{id}")
    Notas findNotaById(@PathVariable int codigo) {
        return service.findById(codigo);
    }

    @GetMapping("/notas/busquedaTituloFecha")
    List<Notas> findNotaByTitulo(@RequestParam String titulo, @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") Date fecha) {
        List<Notas> notas = service.findByTituloFecha(titulo, fecha);
        return notas;
    }

    @DeleteMapping("/notas/{id}")
    void deleteNota(@PathVariable int codigo) {
        service.deleteById(codigo);
    }

    @PostMapping("/notas")
    Notas nuevoNota(@RequestBody Notas notas) {
        return service.save(notas);
    }

    @PutMapping("/notas/{id}")
    void modificarNota(@PathVariable int codigo,@RequestBody Notas notas){
        service.update(codigo,notas);
    }
}
