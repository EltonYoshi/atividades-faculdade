import java.util.ArrayList;

public abstract class Usuario {
	private String nome;
	private String email;
	private ArrayList<Eventos> armazenamentoEvento;	
	

	
	public Usuario() {
		
		this.armazenamentoEvento = new ArrayList<>();
	}
	
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

	
	public ArrayList<Eventos> getArmazenamentoEvento() {
		return armazenamentoEvento;
	}


	public void armazenarEvento(Eventos evento) {
		armazenamentoEvento.add(evento);
	}
	
	

	
	
	
	
	
	
	
	
}
