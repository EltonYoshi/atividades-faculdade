package app;

import java.util.ArrayList;

/*Essa classe tem como objetivo: armazenar em um ArrayList os eventos P�BLICOS que o usu�rio cadastrou*/

public class ArmazenamentoEventosPublicos {
	private ArrayList<EventoPublico> armazenamento;
		
	//M�todo Construtor
	public ArmazenamentoEventosPublicos() {
		this.armazenamento = new ArrayList<>();
	}
		

	public ArrayList<EventoPublico> getArmazenamento() {
		return armazenamento;
	}

	//M�todo para armazenar um evento P�BLICO dentro do ArrayList
	public void armazenarEvento(EventoPublico evento) {
		armazenamento.add(evento);
	}
		
}
