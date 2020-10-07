package br.com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.model.Usuario;
import br.com.service.ServiceLogin;
/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//formas de adicionar novo usuário
		ServiceLogin.adicionarUsuario();
		//ServiceLogin.usuarios.add((new Usuario("","","","","123")));
		//ServiceLogin.removeUsuario("");
		//ServiceLogin.removendoUsuario("");
		
		//String userEmail = request.getParameter("userEmail");
		String login = request.getParameter("login");
		String userEmail = login+"@iesp.edu.br";
		
		String senha = request.getParameter("senha");
		//CadastroContatoServlet teste = new CadastroContatoServlet();
		
		HttpSession session = request.getSession();
		
		if (ServiceLogin.login(login, senha)) {
			session.setAttribute("userEmail", userEmail);
			session.setAttribute("logado", login);
			//request.setAttribute("login", login);
			//RequestDispatcher rd = request.getRequestDispatcher("Menu.jsp");
			//rd.forward(request, response);

			response.sendRedirect("Menu.jsp");
			
		} else {
			session.setAttribute("userEmail", null);
			session.setAttribute("logado", null);
			request.setAttribute("erro", "Login ou senha, inválido");
			RequestDispatcher rd = request.getRequestDispatcher("erro.jsp");
			rd.forward(request, response);
		}
	}

}

/*
PASSO 1: DEIXAR 1 USUÁRIO PRÉ-CADASTRADO
PASSO 2: LOGAR NO USUÁRIO PRÉ-CADASTRADO
PASSO 3: NO ATO DO CADASTRO DE CONTATO, CADASTRAR O CONTATO COM UMA INFORMAÇÃO ADICIONAL QUE SERIA userEmail, quando fosse listar os usuários listava só os usuários do userEmail que tava logado.

*/
