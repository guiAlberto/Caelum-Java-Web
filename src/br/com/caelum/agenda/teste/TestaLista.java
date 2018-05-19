package br.com.caelum.agenda.teste;

import java.sql.SQLException;
import java.util.List;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;
import br.com.caelum.agenda.teste.util.TestUtil;

public class TestaLista {

	public static void main(String[] args) throws SQLException {
		ContatoDao dao = new ContatoDao();

		List<Contato> contatos = dao.getLista();
		TestUtil.print(contatos);

	}

}
