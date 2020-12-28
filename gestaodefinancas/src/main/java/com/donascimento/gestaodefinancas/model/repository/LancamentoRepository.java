package com.donascimento.gestaodefinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.donascimento.gestaodefinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
