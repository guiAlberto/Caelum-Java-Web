package br.com.caelum.agenda.teste.util;

import java.util.List;

import br.com.caelum.agenda.modelo.Contato;
import br.com.caelum.agenda.util.DateUtil;

public class TestUtil {

	private static TestUtil instance;

	private TestUtil() {
	}

	public static TestUtil getInstance() {
		if (null == instance) {
			instance = new TestUtil();
		}
		return instance;
	}

	public static void print(List<Contato> contatos) {
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de nascimento: " + DateUtil.stringify(contato.getDataNascimento()));
			System.out.println();
		}
	}

}
