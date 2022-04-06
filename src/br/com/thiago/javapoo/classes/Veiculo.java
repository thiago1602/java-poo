package br.com.thiago.javapoo.classes;

public class Veiculo {

	public String nome;
	public String marca;
	public String chassi;
	public Integer quantidadeRodas;
	
	public void ligar() {
		System.out.println("O veiculo ligou");
	}
	
	public void desligar() {
		System.out.println("O veiculo desligou");
	}
	
	public float abastecer(float litros) {
		return litros;
	}
}
