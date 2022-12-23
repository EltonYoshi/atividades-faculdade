package app;

import java.util.ArrayList;

/*Essa classe tem como objetivo: armazenar em um ArrayList os eventos PÚBLICOS que o usuário cadastrou*/

public class ArmazenamentoEventosPublicos {
	private ArrayList<EventoPublico> armazenamento;
		
	//Método Construtor
	public ArmazenamentoEventosPublicos() {
		this.armazenamento = new ArrayList<>();
	}
		

	public ArrayList<EventoPublico> getArmazenamento() {
		return armazenamento;
	}

	//Método para armazenar um evento PÚBLICO dentro do ArrayList
	public void armazenarEvento(EventoPublico evento) {
		armazenamento.add(evento);
	}
		
}
