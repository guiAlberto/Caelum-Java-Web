<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de contatos</title>
</head>
<body>

	<c:import url="cabecalho.jsp"></c:import>

	<!-- cria o DAO -->
	<jsp:useBean id="dao" class="br.com.caelum.agenda.dao.ContatoDao" />

	<display:table name="${dao.lista}">
		<display:column property="nome" title="Nome"></display:column>
		<display:column property="email" title="E-mail"></display:column>
		<display:column property="endereco" title="Endereço"></display:column>
		<display:column property="dataNascimento.time"
			title="Data de nascimento" format="{0,date,dd/MM/yyyy}"></display:column>
	</display:table>

	<c:import url="rodape.jsp"></c:import>
</body>
</html>