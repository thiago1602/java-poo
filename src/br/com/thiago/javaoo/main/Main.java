package br.com.thiago.javaoo.main;

import br.com.thiago.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.thiago.javapoo.classes.Carro;
import br.com.thiago.javapoo.classes.Moto;
import br.com.thiago.javapoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {

		try {		
			Veiculo corsa = new Carro("Corsa", "GM");
			corsa.setChassi("ABCDF");
			corsa.abastecer(10);
			
			Veiculo honda = new Moto();
			honda.setNome("Fan");
			
			((Carro)corsa).setQuantidadePortas(5);
			System.out.println(corsa.getNome());
			System.out.println(corsa.getQuantidadeCombustivel());
			System.out.println(corsa.getQuantidadeRodas());
			System.out.println(String.format(""
					+ "O veiculo %s esta ligado %b", corsa.getNome(), corsa.isLigado()));
			corsa.abastecer(10);
			corsa.ligar();
			corsa.abastecer(5);
			
		}catch(AbastecimentoVeiculoLigadoException e) {
			System.out.println("Carro esta ligado, por favor desligar");
		}
		
		catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
	}
}
