package app;

public class Aluno {
	private String nome;
	private int matricula;
	
	
	
	

	public Aluno() {
		this.nome = nome;
		this.matricula = matricula;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nMatricula: " + this.matricula;
	}
	
	
	
}
