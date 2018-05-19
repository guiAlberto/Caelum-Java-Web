package br.com.caelum.agenda.teste.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.agenda.modelo.Contato;

public class TestUtil {

	private static final String PATTERN = "dd/MM/yyyy";
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat(PATTERN);

	private static TestUtil singleton = new TestUtil();

	/*
	 * A private Constructor prevents any other class from instantiating.
	 */
	private TestUtil() {
	}

	/* Static 'instance' method */
	public static TestUtil getInstance() {
		return singleton;
	}

	public static void print(List<Contato> contatos) {
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out
					.println("Data de nascimento: " + DATE_FORMAT.format(contato.getDataNascimento().getTime()) + "\n");
		}
	}

}
