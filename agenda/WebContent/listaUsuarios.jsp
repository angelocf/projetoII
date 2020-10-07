<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.com.service.*" %>
<%@include file="includes/session.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Usuarios</title>
</head>
<body>
	<fieldset>
		Usuários: <br>
		<br>
		<c:forEach items="${ServiceLogin.usuarios}" var="usuario">
			Nome:<c:out value="${usuario.nome}"></c:out><br/>
			Email:<c:out value="${usuario.email}"></c:out><br/>
			Telefone:<c:out value="${usuario.telefone}"></c:out><br/>
			Endereço:<c:out value="${usuario.endereco}"></c:out><br/><br/>
		</c:forEach>
	</fieldset>
<% %>
<form action ="cadastroUsuario.jsp">
		<input type="submit" value="Cadastrar um usuário">
	</form>
	<p>
	<form action ="Menu.jsp">
		<input type="submit" value="Voltar para o Menu">
	</form>
	
	
</body>
</html>