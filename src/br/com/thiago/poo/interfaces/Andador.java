package br.com.thiago.poo.interfaces;

import br.com.thiago.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.thiago.javaoo.excecoes.FrenagemVeiculoException;

public interface Andador {

	 void acelerar()  throws AceleracaoVeiculoLigadoException;
	 void frear() throws FrenagemVeiculoException;
}
