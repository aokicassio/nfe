package com.nf.nfe;

import java.math.BigDecimal;

import com.nf.commons.nfe.NFe;
import com.nf.commons.venda.Produto;

public class SaoPauloNFe implements NFe {

	public BigDecimal calcularImposto(Produto produto) {
		BigDecimal imposto = new BigDecimal("0.30");		
		
		return new BigDecimal(produto.getQuantidade())
				.multiply(produto.getValor())
				.multiply(imposto);
	}

}
