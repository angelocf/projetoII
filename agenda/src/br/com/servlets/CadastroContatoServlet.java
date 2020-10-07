package br.com.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.model.Contato;
import br.com.model.Usuario;
import br.com.service.ServiceLogin;

/**
 * Servlet implementation class CadastroContatoServlet
 */
@WebServlet("/CadastroContatoServlet")
public class CadastroContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Contato contato;
	public static List<Contato> contatos = new ArrayList<>();
	public static List<Contato> listaTemp = new ArrayList<>();
	
	public CadastroContatoServlet() {
		this.contato = new Contato();
		//this.contatos = new ArrayList<>();
	}
	
    /*public List<Contato> getListarCadastrados(){
    	return this.contatos;
    }
    public void remover(int indice) {
    	this.contatos.remove(indice);
    }*/
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userEmail = request.getParameter("userEmail");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		
		this.contato.setUserEmail(userEmail);
		this.contato.setNome(nome);
		this.contato.setEmail(email);
		this.contato.setTelefone(telefone);
		this.contato.setEndereco(endereco);

		
		
		//adiciona o contato na lista de contatos
		CadastroContatoServlet.contatos.add(this.contato);
		System.out.println("+1 contato para "+userEmail);
		//após adicionar o contato na lista, o campo de contato é limpado
		this.contato = new Contato();
		
		
		
		request.setAttribute("contatos", this.contatos);
		//RequestDispatcher rd = request.getRequestDispatcher("listaContatos.jsp");
		//rd.forward(request, response);
		response.sendRedirect("listaContatos.jsp");
		
	}

	public static void attListaTempByUserEmail(String userEmail) {
		CadastroContatoServlet.listaTemp = new ArrayList<>();
		for(Contato contato : CadastroContatoServlet.contatos) {
			if(contato.getUserEmail().equals(userEmail)) {
				CadastroContatoServlet.listaTemp.add(contato);
			} else {
				System.out.println(contato.getUserEmail()+" é diferente de "+userEmail);
			}
	
		}
		System.out.println(userEmail+" listatemp atualizada.");
	}

}
