package br.com.caelum.mvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.mvc.logica.Logica;

@WebServlet("/mvc")
@SuppressWarnings("deprecation")
public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		// XXX a apostila pede pra fazer com que esse método lançe IOException , mas eu
		// prefiro não colocar agora e deixar para um momento que seja necessário.

		String parametro = request.getParameter("logica");
		String nomeDaClasse = "br.com.caelum.mvc.logica." + parametro;

		try {
			Class<?> classe = Class.forName(nomeDaClasse);
			Logica logica = (Logica) classe.newInstance();
			String pagina = logica.executa(request, response);
			request.getRequestDispatcher(pagina).forward(request, response);
		} catch (Exception e) {
			// Aqui ele trata Exception por causa da quantidade de excessões que essa parte
			// exige. Se fosse para tratar um a um, seriam os seguintes casos:
			// ClassNotFoundException | InstantiationException | IllegalAccessException |
			// ServletException | IOException

			throw new ServletException("A lógica de negócios causou uma exceção", e);
		}
	}

}
