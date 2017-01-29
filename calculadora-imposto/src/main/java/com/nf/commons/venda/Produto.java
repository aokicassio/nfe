package com.nf.commons.venda;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	
	private BigDecimal valor;
	
	private Integer quantidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public BigDecimal calcularValorTotal(){
		return new BigDecimal(getQuantidade()).multiply(getValor());	
	}

}
