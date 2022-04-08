package br.com.thiago.javaoo.excecoes;

public class ChassiInvalidoException extends Exception {

	private static final long serialVersionUID = -4052583421613483419L;

	public ChassiInvalidoException(String chassi) {
		super(String.format("Chassi inválido [%s]", chassi));
	}
}
