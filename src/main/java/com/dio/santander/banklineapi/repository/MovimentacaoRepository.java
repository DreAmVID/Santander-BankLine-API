package com.dio.santander.banklineapi.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.santander.banklineapi.model.Movimentacao;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
	
	public List<Movimentacao>findByIdConta(Integer idConta);

}
