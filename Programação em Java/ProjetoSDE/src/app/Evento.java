package app;

public class Evento {
	private String nome;
	private String endereco;
	private int horario;
	private String categoria;
	private String descricao;
	
	
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Nome do Evento: " + nome + "\nEndere�o: " + endereco + "\nHorario: " + horario + "\nCategoria: " + categoria
				+ "\nDescri��o: " + descricao;
	}
	
	
	
	
	
	
}
