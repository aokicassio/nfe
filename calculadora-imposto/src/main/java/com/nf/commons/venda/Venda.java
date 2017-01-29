package com.nf.commons.venda;

import java.math.BigDecimal;

import com.nf.commons.boleta.Boleto;
import com.nf.commons.factory.ModuloVendaFactory;
import com.nf.commons.nfe.NFe;

public class Venda {
	
	private NFe nfe;
	
	private Boleto boleto;
	
	public Venda(ModuloVendaFactory moduloVendaFactory) {
		this.nfe = moduloVendaFactory.criarNFe();
		this.boleto = moduloVendaFactory.criarBoleto();
		
	}

	public void realizar(Produto produto){
		BigDecimal imposto = nfe.calcularImposto(produto);

		boleto.emitir(produto, imposto);
	}

}
