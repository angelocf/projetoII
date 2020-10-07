<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.com.servlets.*" %>
<%@include file="includes/session.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Contatos</title>
</head>
<body>
	<fieldset>
	<% CadastroContatoServlet.attListaTempByUserEmail((String)session.getAttribute("userEmail")); %>
		Contatos de ${logado} <br>
		<c:forEach items="${CadastroContatoServlet.listaTemp}" var="contato">
		Salvo no E-mail:<c:out value="${contato.userEmail}"></c:out><br> <!--<a href="editarContato.jsp">Editar Contato</a><br/>	-->
			Nome:<c:out value="${contato.nome}"></c:out><br/>
			Email:<c:out value="${contato.email}"></c:out><br/>
			Telefone:<c:out value="${contato.telefone}"></c:out><br/>
			Endereço:<c:out value="${contato.endereco}"></c:out><br/><br/>
		</c:forEach>
	</fieldset>	
	<br><p>
	<form action ="Menu.jsp">
		<input type="submit" value="Voltar para o Menu">
	</form>
	
	
</body>
</html>