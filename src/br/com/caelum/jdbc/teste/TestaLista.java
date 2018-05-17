package br.com.caelum.jdbc.teste;

import static java.util.Arrays.asList;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	
	private static final String PATTERN = "dd/MM/yyyy";
	private static final DateFormat DATE_FORMAT = new SimpleDateFormat(PATTERN);
	
	public static void main(String[] args) throws SQLException {
		ContatoDao dao = new ContatoDao();
//		List<Contato> contatos = dao.getLista();
//		print(contatos);
		
//		List<Contato> nomesLike = dao.getContatosWithNameStart("G");
//		print(nomesLike);
		
		Contato contato = dao.pesquisar(1);
		print(asList(contato));
		
	}

	private static void print(List<Contato> contatos) {
		for(Contato contato: contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de nascimento: " + 
					DATE_FORMAT.format(contato.getDataNascimento().getTime()) + "\n");
		}
	}

}
