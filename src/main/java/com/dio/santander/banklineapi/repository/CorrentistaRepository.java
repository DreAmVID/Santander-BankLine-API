package com.dio.santander.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.santander.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository <Correntista, Integer> {

}
