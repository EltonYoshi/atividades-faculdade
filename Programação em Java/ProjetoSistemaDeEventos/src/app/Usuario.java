package app;

public class Usuario {
	private String nome;
	private double cpf;
	private String email;

	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	//ToString que retorna as informa??es armazenadas nos atributos de Usu?rio
	@Override
	public String toString() {
		return "Nome do Usu?rio: " + this.nome + "\nCPF: " + this.cpf + "\nEmail: " + this.email;
	}
	
	
	
}
