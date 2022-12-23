package app;

import java.util.Scanner;
public class MenuOpcao {
	private Scanner sc;
	private MenuOpcaoController controller;

	//Método Construtor
	public MenuOpcao() {
		this.sc = new Scanner(System.in);
		this.controller = new MenuOpcaoController();
	}

	//Método voltado para a criação de um menu com opções para o usuário escolher
	public void mostrarMenuOpcao(){
		
		//Loop para que o menu apareça após a execução de uma opcão
		int escolha = 0;
		do {
			System.out.println("DIGITE:");
			System.out.println("1 - Cadastrar Usuario");
			System.out.println("2 - Cadastrar Evento");
			System.out.println("3 - Participar de um Evento Público");
			System.out.println("4 - Ver Eventos Públicos que você está participando");
			System.out.println("5 - Ver Eventos Privados que você está convidado");
			System.out.println("6 - Ver Todos Eventos Públicos");
			System.out.println("0 - Sair");
			System.out.println("Digite sua escolha: ");
			escolha = Integer.parseInt(sc.nextLine());
			
			//Método da Classe Menu Controller que recebe a escolha do usuário
			controller.efetuaEscolha(escolha);
			
		}while(escolha != 0);
	}
}
