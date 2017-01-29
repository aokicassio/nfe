package com.nf.commons.factory;

import com.nf.commons.boleta.Boleto;
import com.nf.commons.nfe.NFe;

public interface ModuloVendaFactory {
	
	public NFe criarNFe();
	
	public Boleto criarBoleto();
	
}
