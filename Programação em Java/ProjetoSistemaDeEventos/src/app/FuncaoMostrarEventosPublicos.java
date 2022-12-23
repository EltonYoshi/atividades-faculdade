package app;
import java.util.Date;

public class FuncaoMostrarEventosPublicos {
	private ArmazenamentoEventosPublicos eventos;
	private Date agora;
	
	//Método Construtor
	public FuncaoMostrarEventosPublicos(ArmazenamentoEventosPublicos eventos) {
		this.eventos = eventos;
		this.agora = new Date();
	}
	
	//Método que retorna os eventos que já aconteceram
	public void eventosOcorridos() {
		System.out.println("EVENTOS OCORRIDOS: \n");
		/*Loop que printa na tela todos os eventos que possuem a data de término antes da atual*/
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(eventos.getArmazenamento().get(i).DataCompletaTermino().before(agora)) {
				System.out.println("Evento - "+ (i+1) +"\nNome do Evento: " + eventos.getArmazenamento().get(i).getNome() +
						"\nEndereço: " + eventos.getArmazenamento().get(i).getEndereco() +
						"\nData: " + eventos.getArmazenamento().get(i).getDataFormatada() +
						"\nHora de Término: " + eventos.getArmazenamento().get(i).getHorarioTerminoFormatado()+
						"\nDescricao: " + eventos.getArmazenamento().get(i).getDescricao() + "\n");
			}
		}
		
		
		
	}
	//Método que retorna os eventos que vão acontecer
	public void eventosOcorrer() {
		System.out.println("EVENTOS QUE VÃO OCORRER: \n");
		/*Loop que printa na tela todos os eventos que possuem a data de início depois da atual*/
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(eventos.getArmazenamento().get(i).DataCompletaInicio().after(agora)) {
				System.out.println("Evento - "+ (i+1) + "\nNome do Evento: " + eventos.getArmazenamento().get(i).getNome() +
						"\nEndereço: " + eventos.getArmazenamento().get(i).getEndereco() +
						"\nData: " + eventos.getArmazenamento().get(i).getDataFormatada() +
						"\nHora de Inicio: " + eventos.getArmazenamento().get(i).getHorarioInicioFormatado() +
						"\nHora de Término: " + eventos.getArmazenamento().get(i).getHorarioTerminoFormatado()+
						"\nDescricao: " + eventos.getArmazenamento().get(i).getDescricao() + "\n");
			}
		}
		
		
		
	}
	//Método que retorna os eventos que estão acontecendo no momento da execução do programa
	public void eventosOcorrendo() {
		System.out.println("EVENTOS QUE ESTÃO OCORRENDO: \n");
		/*Loop que printa na tela todos os eventos que possuem a data atual antes da data de término 
		 * E possui a data atual depois da data de início */
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(agora.before(eventos.getArmazenamento().get(i).DataCompletaTermino()) && 
					agora.after(eventos.getArmazenamento().get(i).DataCompletaInicio())) {
				System.out.println("Evento - "+ (i+1) + "\nNome do Evento: " + eventos.getArmazenamento().get(i).getNome() +
						"\nEndereço: " + eventos.getArmazenamento().get(i).getEndereco() +
						"\nData: " + eventos.getArmazenamento().get(i).getDataFormatada() +
						"\nHora de Inicio: " + eventos.getArmazenamento().get(i).getHorarioInicioFormatado() +
						"\nHora de Término: " + eventos.getArmazenamento().get(i).getHorarioTerminoFormatado()+
						"\nDescricao: " + eventos.getArmazenamento().get(i).getDescricao() + "\n");
			}
		}
		
		
		
	}
	
	
	
	
}
