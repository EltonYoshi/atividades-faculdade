package app;

import java.util.Scanner;
public class MenuOpcao {
	private Scanner sc;
	private MenuOpcaoController controller;

	public MenuOpcao() {
		this.sc = new Scanner(System.in);
		this.controller = new MenuOpcaoController();
	}

	
	public void mostrarMenuOpcao(){
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
			controller.efetuaEscolha(escolha);
			
		}while(escolha != 0);
	}
}
