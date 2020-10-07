<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.com.servlets.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if(session.getAttribute("logado")==null){
		response.sendRedirect("login.jsp");
	}
	%>
	<fieldset>
		<form action="CadastroContatoServlet" method="POST">
		
		<input name="userEmail" id="userEmail" type="text" value="<% out.println(session.getAttribute("userEmail")); %>"><br><br>
		Nome: <input name="nome" id="nome" type="text"><br><br>
		E-mail: <input name="email" id="email" type="text"><br><br>
		Telefone: <input name="telefone" id="telefone" type="text"><br><br>
		Endereço: <input name="endereco" id="endereco" type="text"><br><br>
	
		<input type="submit" value="Cadastrar">

		</form>
	</fieldset>
	<form action ="Menu.jsp">
		<input type="submit" value="Voltar para o Menu">
	</form>
</body>
</html>