package com.nf.commons.nfe;

import java.math.BigDecimal;

import com.nf.commons.venda.Produto;

public interface NFe {
		
	public BigDecimal calcularImposto(Produto produto);

}
