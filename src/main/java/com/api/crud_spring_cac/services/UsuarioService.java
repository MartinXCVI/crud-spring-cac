package com.api.crud_spring_cac.services;

import com.api.crud_spring_cac.models.UsuarioModel;
import com.api.crud_spring_cac.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    IUsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> getById(Long id) {
        return usuarioRepository.findById(id);
    }
}
