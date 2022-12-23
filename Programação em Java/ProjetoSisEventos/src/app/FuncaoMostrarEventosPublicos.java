package app;
import java.time.Period;
import java.util.Date;

public class FuncaoMostrarEventosPublicos {
	private ArmazenamentoEventosPublicos eventos;
	private Date agora;
	
	public FuncaoMostrarEventosPublicos(ArmazenamentoEventosPublicos eventos) {
		this.eventos = eventos;
		this.agora = new Date();
	}
	
	public void eventosOcorridos() {
		System.out.println("EVENTOS OCORRIDOS: \n");
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(eventos.getArmazenamento().get(i).DataCompletaTermino().before(agora)) {
				System.out.println("Evento - "+ (i+1) +"\nNome do Evento: " + eventos.getArmazenamento().get(i).getNome() +
						"\nEndere�o: " + eventos.getArmazenamento().get(i).getEndereco() +
						"\nData: " + eventos.getArmazenamento().get(i).getDataFormatada() +
						"\nHora de T�rmino: " + eventos.getArmazenamento().get(i).getHorarioTerminoFormatado()+
						"\nDescricao: " + eventos.getArmazenamento().get(i).getDescricao() + "\n");
			}
		}
		
		
		
	}
	public void eventosOcorrer() {
		System.out.println("EVENTOS QUE V�O OCORRER: \n");
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(eventos.getArmazenamento().get(i).DataCompletaInicio().after(agora)) {
				System.out.println("Evento - "+ (i+1) + "\nNome do Evento: " + eventos.getArmazenamento().get(i).getNome() +
						"\nEndere�o: " + eventos.getArmazenamento().get(i).getEndereco() +
						"\nData: " + eventos.getArmazenamento().get(i).getDataFormatada() +
						"\nHora de Inicio: " + eventos.getArmazenamento().get(i).getHorarioInicioFormatado() +
						"\nHora de T�rmino: " + eventos.getArmazenamento().get(i).getHorarioTerminoFormatado()+
						"\nDescricao: " + eventos.getArmazenamento().get(i).getDescricao() + "\n");
			}
		}
		
		
		
	}
	public void eventosOcorrendo() {
		System.out.println("EVENTOS QUE EST�O OCORRENDO: \n");
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(agora.before(eventos.getArmazenamento().get(i).DataCompletaTermino()) && 
					agora.after(eventos.getArmazenamento().get(i).DataCompletaInicio())) {
				System.out.println("Evento - "+ (i+1) + "\nNome do Evento: " + eventos.getArmazenamento().get(i).getNome() +
						"\nEndere�o: " + eventos.getArmazenamento().get(i).getEndereco() +
						"\nData: " + eventos.getArmazenamento().get(i).getDataFormatada() +
						"\nHora de Inicio: " + eventos.getArmazenamento().get(i).getHorarioInicioFormatado() +
						"\nHora de T�rmino: " + eventos.getArmazenamento().get(i).getHorarioTerminoFormatado()+
						"\nDescricao: " + eventos.getArmazenamento().get(i).getDescricao() + "\n");
			}
		}
		
		
		
	}
	
	
	
	
}
