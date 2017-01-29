package com.nf.test.mg;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.nf.commons.factory.ModuloVendaFactory;
import com.nf.commons.venda.Produto;
import com.nf.commons.venda.Venda;
import com.nf.loja.factory.ModuloVendaMGFactory;

public class MinasGeraisTest {

	private Venda venda;
	
	@Before
	public void init() {
		ModuloVendaFactory moduloVendaFactory = new ModuloVendaMGFactory();
		venda = new Venda(moduloVendaFactory);
	}
	
	
	@Test
	public void teste(){
		Produto produto = new Produto();
		
		produto.setNome("Caneca");
		produto.setQuantidade(20);
		produto.setValor(new BigDecimal("15.50"));
		
		venda.realizar(produto);
	}
	

}
