package app;

import java.util.Date;
import java.util.Scanner;

public class FuncaoMostrarEventosPrivados {
	private ArmazenamentoEventosPrivados eventos;
	private Date agora;
	private Scanner sc;
	private double cpf;
	
	public FuncaoMostrarEventosPrivados(ArmazenamentoEventosPrivados eventos) {
		this.eventos = eventos;
		this.agora = new Date();
		this.sc = new Scanner(System.in);
	}
	
	public void mostrarEventosDoUsuario() {
		System.out.println("Digite seu CPF: ");
		this.cpf = sc.nextDouble();
		
		System.out.println("EVENTOS OCORRIDOS: \n");
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(eventos.getArmazenamento().get(i).getEventoUsuario().size() > 0) {
				for(int j = 0; j < eventos.getArmazenamento().get(i).getEventoUsuario().size(); j++) {
					
					if(this.cpf == eventos.getArmazenamento().get(i).getEventoUsuario().get(j).getCpf()) {
						if(eventos.getArmazenamento().get(i).DataCompletaTermino().before(agora)) {
							System.out.println("Evento - "+ (i+1) +"\nNome do Evento: " + eventos.getArmazenamento().get(i).getNome() +
									"\nEndere�o: " + eventos.getArmazenamento().get(i).getEndereco() +
									"\nData: " + eventos.getArmazenamento().get(i).getDataFormatada() +
									"\nHora de T�rmino: " + eventos.getArmazenamento().get(i).getHorarioTerminoFormatado()+
									"\nDescricao: " + eventos.getArmazenamento().get(i).getDescricao() + "\n");
						}
					}
					
				}	
				
			}else {
				System.out.println("N�o foi encontrado nenhum evento que j� tenha ocorrido.");
			}
			
		}
		
		System.out.println("EVENTOS QUE V�O OCORRER: \n");
		
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(eventos.getArmazenamento().get(i).getEventoUsuario().size() > 0) {
				for(int j = 0; j < eventos.getArmazenamento().get(i).getEventoUsuario().size(); j++) {
					
					if(this.cpf == eventos.getArmazenamento().get(i).getEventoUsuario().get(j).getCpf()) {
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
				
			}else {
				System.out.println("N�o foi encontrado nenhum evento que ir� ocorrer.");
			}
			
		}
		
	System.out.println("EVENTOS QUE EST�O OCORRENDO: \n");
			
			for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
				if(eventos.getArmazenamento().get(i).getEventoUsuario().size() > 0) {
					for(int j = 0; j < eventos.getArmazenamento().get(i).getEventoUsuario().size(); j++) {
						
						if(this.cpf == eventos.getArmazenamento().get(i).getEventoUsuario().get(j).getCpf()) {
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
					
				}else {
					System.out.println("N�o foi encontrado nenhum evento que est� ocorrendo.");
				}
				
			}
		
		
		
	}
}
