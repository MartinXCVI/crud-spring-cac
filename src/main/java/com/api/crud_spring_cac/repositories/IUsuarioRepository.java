package com.api.crud_spring_cac.repositories;

import com.api.crud_spring_cac.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IUsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
