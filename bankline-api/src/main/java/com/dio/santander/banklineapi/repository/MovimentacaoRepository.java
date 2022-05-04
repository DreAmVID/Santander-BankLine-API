package com.dio.santander.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
