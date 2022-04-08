package br.com.thiago.javaoo.main;

import br.com.thiago.javapoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {

		try {
			Veiculo corsa = new Veiculo();
			corsa.setMarca("GM");
			corsa.setNome("Corsa");
			corsa.setChassi("ABCDEf");
			corsa.abastecer(10);
			System.out.println(corsa.getNome());
			System.out.println(corsa.getQuantidadeCombustivel());
			corsa.ligar();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
	}
}
