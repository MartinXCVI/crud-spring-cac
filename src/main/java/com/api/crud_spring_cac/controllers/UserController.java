package com.api.crud_spring_cac.controllers;

import com.api.crud_spring_cac.models.UsuarioModel;
import com.api.crud_spring_cac.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ArrayList<UsuarioModel> getUsuarios() {
        return this.usuarioService.getUsuarios();
    }

    @PostMapping
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.guardarUsuario(usuario);
    }

}
