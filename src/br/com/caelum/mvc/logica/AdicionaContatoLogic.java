package br.com.caelum.mvc.logica;

import java.sql.Connection;
import java.text.ParseException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;
import br.com.caelum.agenda.util.DateUtil;

public class AdicionaContatoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {
		Contato contato = new Contato();

		contato.setNome(req.getParameter("nome"));
		contato.setEmail(req.getParameter("email"));
		contato.setEndereco(req.getParameter("endereco"));

		Calendar dataNascimento = null;
		try {
			dataNascimento = DateUtil.calendarfy(req.getParameter("dataNascimento"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		contato.setDataNascimento(dataNascimento);

		Connection connection = (Connection) req.getAttribute("conexao");
		new ContatoDao(connection).adiciona(contato);
		return "/WEB-INF/jsp/contato-adicionado.jsp?nome=" + contato.getNome();
	}

}
