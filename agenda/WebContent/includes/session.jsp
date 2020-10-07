<%
if(session.getAttribute("logado") == null){
	response.sendRedirect("login.jsp");
}
%>