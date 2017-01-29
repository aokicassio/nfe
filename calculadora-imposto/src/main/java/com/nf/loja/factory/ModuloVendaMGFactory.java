package com.nf.loja.factory;

import java.util.Properties;

import com.nf.commons.boleta.Boleto;
import com.nf.commons.factory.ModuloVendaFactory;
import com.nf.commons.nfe.NFe;

public class ModuloVendaMGFactory implements ModuloVendaFactory {

Properties properties = new Properties();
	
	public NFe criarNFe() {
		
		NFe nfe = null;
		
		try {
			properties.load(this.getClass().getResourceAsStream("/config.properties"));
			nfe = (NFe) Class.forName(properties.getProperty("nfe.mg")).newInstance();
		} catch (Exception e) {
			throw new IllegalStateException("Não conseguiu carregar a classe para NF-e");
		}
		
		return nfe;
	}
	
	public Boleto criarBoleto() {
		
		Boleto boleto = null;
		
		try {
			properties.load(this.getClass().getResourceAsStream("/config.properties"));
			boleto = (Boleto) Class.forName(properties.getProperty("boleto.mg")).newInstance();
		} catch (Exception e) {
			throw new IllegalStateException("Não conseguiu carregar a classe para NF-e");
		}
		
		return boleto;
	}
	
}
