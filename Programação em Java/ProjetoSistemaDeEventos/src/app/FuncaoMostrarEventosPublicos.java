package app;
import java.util.Date;

public class FuncaoMostrarEventosPublicos {
	private ArmazenamentoEventosPublicos eventos;
	private Date agora;
	
	//M�todo Construtor
	public FuncaoMostrarEventosPublicos(ArmazenamentoEventosPublicos eventos) {
		this.eventos = eventos;
		this.agora = new Date();
	}
	
	//M�todo que retorna os eventos que j� aconteceram
	public void eventosOcorridos() {
		System.out.println("EVENTOS OCORRIDOS: \n");
		/*Loop que printa na tela todos os eventos que possuem a data de t�rmino antes da atual*/
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
	//M�todo que retorna os eventos que v�o acontecer
	public void eventosOcorrer() {
		System.out.println("EVENTOS QUE V�O OCORRER: \n");
		/*Loop que printa na tela todos os eventos que possuem a data de in�cio depois da atual*/
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
	//M�todo que retorna os eventos que est�o acontecendo no momento da execu��o do programa
	public void eventosOcorrendo() {
		System.out.println("EVENTOS QUE EST�O OCORRENDO: \n");
		/*Loop que printa na tela todos os eventos que possuem a data atual antes da data de t�rmino 
		 * E possui a data atual depois da data de in�cio */
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
