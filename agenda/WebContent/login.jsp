<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.com.service.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<hr>
	<h2>Informações para fins de testes</h2>
	<fieldset>
		Usuários Salvos: <br>
		<br>
		<c:forEach items="${ServiceLogin.usuarios}" var="usuario">
			Nome:<c:out value="${usuario.nome}"></c:out><br/>
			Email:<c:out value="${usuario.email}"></c:out><br/>
			Telefone:<c:out value="${usuario.telefone}"></c:out><br/>
			Endereço:<c:out value="${usuario.endereco}"></c:out><br/><br/>
		</c:forEach>
	</fieldset>
	<hr>
	<div>
		<form action="Login" method="POST">
			
			Login <input type="text" name="login" id="login" ><br><br><br>
			Senha <input type="password" name="senha" id="senha" ><br><br><br>
			
			<input type="submit" value="Enviar">
		</form>
	</div>
</body>
</html>