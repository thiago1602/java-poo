package br.com.thiago.poo.interfaces;

import br.com.thiago.javaoo.excecoes.AbastecimentoVeiculoLigadoException;

public interface VeiculoInterface {

	 
	 void abastecer(float litros) throws AbastecimentoVeiculoLigadoException;
	 void preparar();
}
