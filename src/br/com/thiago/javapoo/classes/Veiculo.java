package br.com.thiago.javapoo.classes;

import br.com.thiago.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.thiago.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.thiago.javaoo.excecoes.ChassiInvalidoException;
import br.com.thiago.javaoo.excecoes.FrenagemVeiculoException;

public class Veiculo {

	private String nome;
	private String marca;
	private String chassi;
	protected Integer quantidadeRodas;
	private float quantidadeCombustivel;
	protected Boolean ligado;
	protected float velocidade;
	
	public Veiculo() {
		this.ligado = false;
		this.velocidade = 0;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) throws Exception {
		if(chassi.length() == 5) {
			this.chassi = chassi;	
		}else {
			throw new ChassiInvalidoException(chassi);
		}
		
	}

	public Integer getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public Boolean isLigado() {
		return ligado;
	}


	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public float getVelocidade() {
		return velocidade;
	}
	
	public void ligar() {
		this.ligado = true;
		this.velocidade = 0;
		System.out.println("O veiculo ligou");
	}
	
	public void desligar() {
		this.ligado = false;
		this.velocidade = 0;
		System.out.println("O veiculo desligou");
	}
	
	public void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
		if(this.ligado) {
			quantidadeCombustivel += litros;
		}
		throw new AbastecimentoVeiculoLigadoException();
	}
	
	public void acelerar() throws AceleracaoVeiculoLigadoException {
		if(this.ligado) {
			this.velocidade +=10;
		}else {
			throw new AceleracaoVeiculoLigadoException();
		}
	}
	
	public void frear() throws FrenagemVeiculoException {
		if(this.ligado) {
			this.velocidade -=10;
		}else {
			throw new FrenagemVeiculoException();
		}
	}
}
