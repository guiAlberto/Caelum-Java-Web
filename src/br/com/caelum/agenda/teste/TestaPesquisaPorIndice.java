package br.com.caelum.agenda.teste;

import static java.util.Arrays.asList;

import java.sql.SQLException;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;
import br.com.caelum.agenda.teste.util.TestUtil;

public class TestaPesquisaPorIndice {

	public static void main(String[] args) throws SQLException {

		ContatoDao dao = new ContatoDao();
		Contato contato = dao.pesquisar(1L);
		TestUtil.print(asList(contato));

	}

}
