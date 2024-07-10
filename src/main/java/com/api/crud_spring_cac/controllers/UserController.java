package com.api.crud_spring_cac.controllers;

import com.api.crud_spring_cac.models.UsuarioModel;
import com.api.crud_spring_cac.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

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

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> getUsersById(@PathVariable("id")Long id){
        return this.usuarioService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public UsuarioModel updateUserById(@RequestBody UsuarioModel request, @PathVariable("id") Long id) {
        return this.usuarioService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        boolean ok = this.usuarioService.deleteUsuario(id);

        if(ok) {
            return "Usuario con ID " + id + " eliminado exitosamente.";
        }
        else {
            return "Error al intentar eliminar. Reintente más tarde.";
        }
    }

}
