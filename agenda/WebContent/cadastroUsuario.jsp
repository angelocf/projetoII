<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@include file="includes/session.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<form action="CadastroUsuarioServlet" method="POST">
		
		Nome: <input name="nome" id="nome" type="text"><br><br>
		E-mail: <input name="email" id="email" type="text"><br><br>
		Telefone: <input name="telefone" id="telefone" type="text"><br><br>
		Endereço: <input name="endereco" id="endereco" type="text"><br><br>
		Senha: <input name="senha" id="senha" type="password"><br><br>
		<input type="submit" value="Cadastrar">


		</form>
	</fieldset>
	<form action ="Menu.jsp">
		<input type="submit" value="Voltar para o Menu">
	</form>
</body>
</html>