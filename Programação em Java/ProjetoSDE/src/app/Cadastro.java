package app;

public class Cadastro {
	private ArmazenamentoUsuario armazenaUsuario;
	private Evento evento;
	
	//Construtor
	public Cadastro() {
		this.armazenaUsuario = new ArmazenamentoUsuario();
		this.evento = new Evento();
	}

	
	//Getters e Setters
	public ArmazenamentoUsuario getArmazenaUsuario() {
		return armazenaUsuario;
	}

	public void setArmazenaUsuario(ArmazenamentoUsuario armazenaUsuario) {
		this.armazenaUsuario = armazenaUsuario;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}


}
