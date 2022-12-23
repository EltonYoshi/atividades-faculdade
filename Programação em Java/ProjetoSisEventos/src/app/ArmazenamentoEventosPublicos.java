package app;

import java.util.ArrayList;

public class ArmazenamentoEventosPublicos {
	private ArrayList<EventoPublico> armazenamento;
		
	public ArmazenamentoEventosPublicos() {
		this.armazenamento = new ArrayList<>();
	}
		

	public ArrayList<EventoPublico> getArmazenamento() {
		return armazenamento;
	}

	public void armazenarEvento(EventoPublico evento) {
		armazenamento.add(evento);
	}
		
}
