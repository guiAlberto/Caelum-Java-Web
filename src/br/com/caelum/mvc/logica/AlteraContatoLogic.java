package br.com.caelum.mvc.logica;

import java.text.ParseException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;
import br.com.caelum.agenda.util.DateUtil;

public class AlteraContatoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {
		Contato contato = new Contato();

		contato.setId(Long.parseLong(req.getParameter("id")));
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

		new ContatoDao().altera(contato);
		return "/WEB-INF/jsp/contato-alterado.jsp";
	}

}
