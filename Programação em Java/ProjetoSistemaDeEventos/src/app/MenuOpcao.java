package app;

import java.util.Scanner;
public class MenuOpcao {
	private Scanner sc;
	private MenuOpcaoController controller;

	//M�todo Construtor
	public MenuOpcao() {
		this.sc = new Scanner(System.in);
		this.controller = new MenuOpcaoController();
	}

	//M�todo voltado para a cria��o de um menu com op��es para o usu�rio escolher
	public void mostrarMenuOpcao(){
		
		//Loop para que o menu apare�a ap�s a execu��o de uma opc�o
		int escolha = 0;
		do {
			System.out.println("DIGITE:");
			System.out.println("1 - Cadastrar Usuario");
			System.out.println("2 - Cadastrar Evento");
			System.out.println("3 - Participar de um Evento P�blico");
			System.out.println("4 - Ver Eventos P�blicos que voc� est� participando");
			System.out.println("5 - Ver Eventos Privados que voc� est� convidado");
			System.out.println("6 - Ver Todos Eventos P�blicos");
			System.out.println("0 - Sair");
			System.out.println("Digite sua escolha: ");
			escolha = Integer.parseInt(sc.nextLine());
			
			//M�todo da Classe Menu Controller que recebe a escolha do usu�rio
			controller.efetuaEscolha(escolha);
			
		}while(escolha != 0);
	}
}
