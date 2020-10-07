package br.com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.model.Contato;
import br.com.model.Usuario;
import br.com.service.ServiceLogin;

@WebServlet("/CadastroUsuarioServlet")
public class CadastroUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private Usuario usuario;
    public List<Usuario> usuarios = new ArrayList<>();
    
    public CadastroUsuarioServlet() {
        this.usuario = new Usuario();
       
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String senha = request.getParameter("senha");
		
		
		this.usuario.setNome(nome);
		this.usuario.setEmail(email);
		this.usuario.setTelefone(telefone);
		this.usuario.setEndereco(endereco);
		this.usuario.setSenha(senha);
		
		//adiciona o contato na lista de contatos
		ServiceLogin.usuarios.add(this.usuario);
		//após adicionar o contato na lista, o campo de contato é limpado
		this.usuario = new Usuario();
		
		
		response.sendRedirect("listaUsuarios.jsp");
	}

}
