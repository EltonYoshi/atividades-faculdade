package app;

import java.util.Scanner;
public class FuncaoParticiparEvento {
	private Scanner sc;
	private ArmazenamentoEventosPublicos eventos;
	private ArmazenamentoUsuario usuarios;
	private int numeroDeEventos;
	
	//M�todo Construtor
	public FuncaoParticiparEvento(ArmazenamentoEventosPublicos eventos, ArmazenamentoUsuario usuarios) {
		this.eventos = eventos;
		this.usuarios = usuarios;
		this.sc = new Scanner(System.in);
	}
	
	//M�todo que retorna todos os eventos P�BLICOS dispon�veis
	public void mostrarEventos() {
		
		this.numeroDeEventos = 0;
		for(int i = 0; i < eventos.getArmazenamento().size(); i++ ) {
			
			System.out.println("Evento"+ " - " + (i+1) + "\n" + eventos.getArmazenamento().get(i) + "\n");
			this.numeroDeEventos++;
		}
	}
	
	//M�todo que procura pelo cpf do usu�rio
	public int usuarioPosicao(double cpf) {
		int posicao = 0;
		
		for(int i = 0; i < usuarios.getArmazenamento().size(); i++) {
			if(cpf == usuarios.getArmazenamento().get(i).getCpf()) {
				posicao = i;
			}
		}
		return posicao;
	}
	
	//M�todo que voltado para escolher o evento P�BLICO que o usu�rio deseja participar
	public void escolherEvento() {
		int escolha = 0;
		do {
			//Recebe a escolha do evento que o usu�rio deseja participar
			System.out.println("Evento escolhido: ");
			escolha = sc.nextInt() - 1;
			
		}while(escolha < 0|| escolha > numeroDeEventos-1);

		
			//Recebe o CPF do usu�rio para o m�todo usuarioPosicao procur�-lo
			System.out.println("Digite seu CPF: ");
			double cpf = sc.nextDouble();
			
			int posicao = usuarioPosicao(cpf);
		
		
		//Loop que adiciona o usu�rio no evento escolhido 
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(escolha == i) {
				eventos.getArmazenamento().get(i).adicionarUsuarioEvento(usuarios.getArmazenamento().get(posicao));
				System.out.println("\nVoc� est� participando do Evento p�blico - " + (i+1) + "\n");
			}
		}
	

	}
}
