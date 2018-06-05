<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

<!DOCTYPE html>
<html>
<head> 
<link rel="stylesheet" href="jquery-ui-1.12.1/jquery-ui.min.css"> 
<script src="jquery-ui-1.12.1/external/jquery/jquery.js"></script> 
<script src="jquery-ui-1.12.1/jquery-ui.min.js"></script> 
</head> 
<body>
	<c:import url="cabecalho.jsp" />
	<h1>Adicionar Contato</h1>
	<hr />
	<form action="mvc">
		Nome: <input type="text" name="nome"/><br />
		E-mail: <input type="text" name="email"/><br />
		Endereço: <input type="text" name="endereco"/><br />
		Data de Nascimento: <caelum:campoData id="dataNascimento"></caelum:campoData>
		<input type="hidden" name="logica" value="AdicionaContatoLogic"/>
		<input type="submit" value="Adicionar" />
	</form>
	 <c:import url="rodape.jsp" /> 
</body>
</html>
