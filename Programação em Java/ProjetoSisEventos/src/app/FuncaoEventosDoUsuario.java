package app;

import java.util.Scanner;
public class FuncaoEventosDoUsuario {
	private ArmazenamentoEventosPublicos eventos;
	private Scanner sc;
	private double cpf;
	
	public FuncaoEventosDoUsuario(ArmazenamentoEventosPublicos eventos) {
		this.eventos = eventos;
		this.sc = new Scanner(System.in);
	}
	
	public void mostrarEventosDoUsuario() {
		System.out.println("Digite seu CPF: ");
		this.cpf = sc.nextDouble();
		
		System.out.println("Voc� est� participando dos eventos abaixo:\n");
		
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(eventos.getArmazenamento().get(i).getEventoUsuario().size() > 0) {
				for(int j = 0; j < eventos.getArmazenamento().get(i).getEventoUsuario().size(); j++) {
					
					if(this.cpf == eventos.getArmazenamento().get(i).getEventoUsuario().get(j).getCpf()) {
						System.out.println("Evento - " + (i+1) + "\n" + eventos.getArmazenamento().get(i).getNome());
					}
					
				}	
				
			}
			
		}
	
		
		
		
		
	}
	
	public void cancelarParticipacao() {
		int opcao = 0;
		do {
			System.out.println("Voc� deseja cancelar sua participa��o algum evento?");
			System.out.println("1 - Cancelar sua participa��o ");
			System.out.println("0 - Voltar para o menu ");
			opcao = sc.nextInt();
		}while(opcao < 0 || opcao > 1);
		
		if (opcao == 1) {
			System.out.println("Escolha um evento para cancelar: ");
			int escolha = sc.nextInt() - 1;
			
			for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
				if(eventos.getArmazenamento().get(i).getEventoUsuario().size() > 0) {
					for(int j = 0; j < eventos.getArmazenamento().get(i).getEventoUsuario().size(); j++) {
						
						if(this.cpf == eventos.getArmazenamento().get(i).getEventoUsuario().get(j).getCpf() && 
							escolha == i) {
							eventos.getArmazenamento().remove(i);
							System.out.println("Evento cancelado com sucesso!");
						}
						
					}	
					
				}
				
			}
			
			
			
			
			
			
		}
		
	}
}
