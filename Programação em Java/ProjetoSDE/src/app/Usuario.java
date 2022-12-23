package app;
import java.util.ArrayList;

public abstract class Usuario {
	private String nome;
	private String email;
	private ArrayList<Evento> armazenamentoEvento;
	
	//Construtor
	public Usuario () {
		this.armazenamentoEvento = new ArrayList<>();
	}

	
	//Getters e Setters
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

	public ArrayList<Evento> getArmazenamentoEvento() {
		return armazenamentoEvento;
	}

	public void armazenarEvento (Evento evento) {
		this.armazenamentoEvento.add(evento);
	}
	
	
	
	
}
