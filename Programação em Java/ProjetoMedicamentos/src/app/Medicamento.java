package app;



public class Medicamento {
	private String nome;
	private String substancia;

	

	public Medicamento(String nome, String substancia) {
		this.nome = nome;
		this.substancia = substancia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public String getSubstancia() {
		return substancia;
	}

	public void setSubstancia(String substancia) {
		this.substancia = substancia;
	}

	@Override
	public String toString() {
		return "Medicamento [nome=" + nome + ", substancia=" + substancia + "]";
	}


	
	
	
	
	
}
