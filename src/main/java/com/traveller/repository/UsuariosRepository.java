package com.traveller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traveller.model.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios , Long> {

}
