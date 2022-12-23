package app;

import java.util.Scanner;
public class FuncaoParticiparEvento {
	private Scanner sc;
	private ArmazenamentoEventosPublicos eventos;
	private ArmazenamentoUsuario usuarios;
	private int numeroDeEventos;
	
	//Método Construtor
	public FuncaoParticiparEvento(ArmazenamentoEventosPublicos eventos, ArmazenamentoUsuario usuarios) {
		this.eventos = eventos;
		this.usuarios = usuarios;
		this.sc = new Scanner(System.in);
	}
	
	//Método que retorna todos os eventos PÚBLICOS disponíveis
	public void mostrarEventos() {
		
		this.numeroDeEventos = 0;
		for(int i = 0; i < eventos.getArmazenamento().size(); i++ ) {
			
			System.out.println("Evento"+ " - " + (i+1) + "\n" + eventos.getArmazenamento().get(i) + "\n");
			this.numeroDeEventos++;
		}
	}
	
	//Método que procura pelo cpf do usuário
	public int usuarioPosicao(double cpf) {
		int posicao = 0;
		
		for(int i = 0; i < usuarios.getArmazenamento().size(); i++) {
			if(cpf == usuarios.getArmazenamento().get(i).getCpf()) {
				posicao = i;
			}
		}
		return posicao;
	}
	
	//Método que voltado para escolher o evento PÚBLICO que o usuário deseja participar
	public void escolherEvento() {
		int escolha = 0;
		do {
			//Recebe a escolha do evento que o usuário deseja participar
			System.out.println("Evento escolhido: ");
			escolha = sc.nextInt() - 1;
			
		}while(escolha < 0|| escolha > numeroDeEventos-1);

		
			//Recebe o CPF do usuário para o método usuarioPosicao procurá-lo
			System.out.println("Digite seu CPF: ");
			double cpf = sc.nextDouble();
			
			int posicao = usuarioPosicao(cpf);
		
		
		//Loop que adiciona o usuário no evento escolhido 
		for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
			if(escolha == i) {
				eventos.getArmazenamento().get(i).adicionarUsuarioEvento(usuarios.getArmazenamento().get(posicao));
				System.out.println("\nVocê está participando do Evento público - " + (i+1) + "\n");
			}
		}
	

	}
}
