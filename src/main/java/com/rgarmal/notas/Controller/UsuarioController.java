package com.rgarmal.notas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rgarmal.notas.model.Usuario;
import com.rgarmal.notas.services.Impl.UsuarioService;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioService service;

    @RequestMapping("/buscar")
    Usuario findByusername(@RequestParam String username, @RequestParam String password) {
        return service.findByusername(username, password);
    }
}
