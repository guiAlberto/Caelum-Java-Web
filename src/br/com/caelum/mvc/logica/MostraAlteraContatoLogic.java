package br.com.caelum.mvc.logica;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class MostraAlteraContatoLogic implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {
		try {
			Long id = Long.parseLong(req.getParameter("id"));
			Contato contato = new ContatoDao().pesquisar(id);
			req.setAttribute("contato", contato);
			return "/WEB-INF/jsp/altera-contato.jsp";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
