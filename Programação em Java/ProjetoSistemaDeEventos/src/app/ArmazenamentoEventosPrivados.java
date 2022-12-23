package app;

import java.util.ArrayList;

/*Essa classe tem como objetivo: armazenar em um ArrayList os eventos PRIVADOS que o usuário cadastrou*/

public class ArmazenamentoEventosPrivados {
	private ArrayList<EventoPrivado> armazenamentoPrivado;
	
	//Método Construtor
	public ArmazenamentoEventosPrivados() {
		this.armazenamentoPrivado = new ArrayList<>();
	}
		
	
	
	
	public ArrayList<EventoPrivado> getArmazenamento() {
		return armazenamentoPrivado;
	}

	//Método para armazenar um evento PRIVADO dentro do ArrayList
	public void armazenarEvento(EventoPrivado evento) {
		armazenamentoPrivado.add(evento);
	}
		
}

