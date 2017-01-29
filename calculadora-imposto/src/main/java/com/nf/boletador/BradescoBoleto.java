package com.nf.boletador;

import java.math.BigDecimal;

import com.nf.commons.boleta.Boleto;
import com.nf.commons.venda.Produto;

public class BradescoBoleto implements Boleto {

	public void emitir(Produto produto, BigDecimal imposto) {
		System.out.println("Emitindo boleto Banco Bradesco");
		
		System.out.println("-----------------------------------------");
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Valor Unitário: " + produto.getValor());
		System.out.println("Subtotal: " + produto.calcularValorTotal());
		System.out.println("Valor Imposto: " + imposto);

		System.out.println("-----------------------------------------");
		System.out.println("Valor Total: " + produto.calcularValorTotal().add(imposto));

	}

}
