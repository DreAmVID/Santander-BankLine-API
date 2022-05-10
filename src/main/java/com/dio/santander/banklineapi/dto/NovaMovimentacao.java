package com.dio.santander.banklineapi.dto;



import com.dio.santander.banklineapi.model.MovimentacaoTipo;

public class NovaMovimentacao {
	
	// Variaveis
	
	private String descricao;
	
	private Double valor;
	
	private MovimentacaoTipo tipo;
	
	private Integer IdConta;
	
	// Getters and Setters

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public MovimentacaoTipo getTipo() {
		return tipo;
	}

	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}

	public Integer getIdConta() {
		return IdConta;
	}

	public void setIdConta(Integer idConta) {
		IdConta = idConta;
	}
	

}
