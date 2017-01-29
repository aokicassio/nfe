package com.nf.test.sp;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.nf.commons.factory.ModuloVendaFactory;
import com.nf.commons.venda.Produto;
import com.nf.commons.venda.Venda;
import com.nf.loja.factory.ModuloVendaSPFactory;

public class SaoPauloTest {
	
	private Venda venda;
	
	@Before
	public void init() {
		ModuloVendaFactory moduloVendaFactory = new ModuloVendaSPFactory();
		venda = new Venda(moduloVendaFactory);
	}
	
	
	@Test
	public void teste(){
		Produto produto = new Produto();
		
		produto.setNome("Camiseta");
		produto.setQuantidade(12);
		produto.setValor(new BigDecimal("25.90"));
		
		venda.realizar(produto);
	}
	

}
