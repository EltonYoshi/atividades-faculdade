package app;
import java.util.Scanner;

public class MenuOpcao {
	private Scanner sc;
	private MenuOpcaoController controller;
	
	public MenuOpcao() {
		this.sc = new Scanner(System.in);
		this.controller = new MenuOpcaoController();
	}
	
	public void mostrarMenuDeOpcao() {
		int escolha = 0;
		do {
			System.out.println("DIGITE:");
			System.out.println("1 - Cadastrar Usuario e um Evento");
			System.out.println("2 - Procurar Usu�rios");
			System.out.println("3 - Ver Eventos do Dia");
			System.out.println("4 - Ver Todos os Eventos");
			System.out.println("0 - Sair");
			System.out.println("Digite sua escolha: ");
			escolha = sc.nextInt();
			controller.efetuaEscolha(escolha);
			
		}while(escolha != 0);
		
			
			
			

	}
	
	
	
}
