package com.nf.commons.boleta;

import java.math.BigDecimal;

import com.nf.commons.venda.Produto;

public interface Boleto {
	
	public void emitir(Produto produto, BigDecimal imposto);

}
