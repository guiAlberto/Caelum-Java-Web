package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {

	// XXX a apostila pede pra fazer com que esse m�todo lan�e Exception, mas eu
	// prefiro n�o colocar agora e deixar para um momento que seja necess�rio.
	String executa(HttpServletRequest req, HttpServletResponse res);

}
