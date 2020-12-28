package com.donascimento.gestaodefinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donascimento.gestaodefinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{


	boolean existsByeEmail(String email);

}
