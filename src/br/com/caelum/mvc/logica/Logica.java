package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {

	// XXX a apostila pede pra fazer com que esse método lançe Exception, mas eu
	// prefiro não colocar agora e deixar para um momento que seja necessário.
	String executa(HttpServletRequest req, HttpServletResponse res);

}
