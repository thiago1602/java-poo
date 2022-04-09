package br.com.thiago.javapoo.classes;

public class Carro extends Veiculo {

	private int quantidadePortas;
	
	
	public Carro() {
		this.quantidadeRodas = 4;
	}
	
	public Carro(String nome, String marca) {
		this.quantidadeRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
	}
	public Carro(String nome, float combustivel) {
		
	}
	
	public Carro(float combustivel, String nome) {
		
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
}
