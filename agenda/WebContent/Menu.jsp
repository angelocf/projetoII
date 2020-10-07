<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--<%@page import="javax.servlet.http.HttpSession"%>-->
<%@page import="br.com.service.ServiceLogin"%>
<%@include file="includes/session.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Logado em: ${login} --><br>
	Logado: ${logado}<br>
	<br>
	<form action ="cadastroUsuario.jsp">
		<input type="submit" value="Cadastrar um usuário">
	</form>
	<br>
	<form action ="listaUsuarios.jsp">
		<input type="submit" value="Listar Usuários">
	</form>
	<br>
	
	<form action ="cadastroContato.jsp">
		<input type="submit" value="Cadastrar um contato">
	</form>
	<br>
	<form action ="listaContatos.jsp">
		<input type="submit" value="Listar Contatos">
	</form>
	
	<hr>
	<!--<a href="Logout">Deslogar</a>-->
	<form action ="Logout">
		<input type="submit" value="Logout">
	</form>
	
	
</body>
</html>