<html>
<body>
	<%-- coment�rio em JSP aqui: nossa primeira p�gina JSO --%>

	<%
		String mensagem = "Bem vindo ao sistema de agenda do FJ-21";
	%>

	<%
		out.println(mensagem);
	%>

	<br />

	<%
		String desenvolvido = "Desenvolvido por Guilherme Moraes";
	%>

	<%=desenvolvido%>

	<br />

	<%
		System.out.println("Tudo foi executado!");
	%>
</body>
</html>