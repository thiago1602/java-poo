package br.com.thiago.javapoo.classes;

import br.com.thiago.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.thiago.javaoo.excecoes.FrenagemVeiculoException;

 public class Moto extends Veiculo {

	public Moto() {
		this.quantidadeRodas = 2;
	}
	
	public Moto(String nome, String marca) {
		this.quantidadeRodas = 2;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
	//Sobreescrevendo métodos
	@Override
	public void acelerar() throws AceleracaoVeiculoLigadoException{
		if(this.isLigado()) {
			this.velocidade += 3;
		}else {
			throw new AceleracaoVeiculoLigadoException();
		}
	}
	@Override
	public void frear() throws FrenagemVeiculoException {
		if(this.isLigado()) {
			this.velocidade -= 3;
		}else {
			throw new FrenagemVeiculoException();
		}
	}

	@Override
	public void preparar() {
		System.out.println("COLOCAR O CAPACETE");		
	}
}
