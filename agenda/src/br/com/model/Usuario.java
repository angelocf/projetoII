package br.com.model;

public class Usuario {
		private String nome;
		private String email;
		private String telefone;
		private String endereco;
		private String senha;
		
		
		public Usuario(String nome, String email, String telefone, String endereco, String senha) {
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
			this.endereco = endereco;
			this.senha = senha;
		}
		
		public Usuario(){}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		
		
}
