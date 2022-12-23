package app;

import java.util.Scanner;
public class MenuOpcaoController {
	private Scanner sc;
	
	//Contrutor
	public MenuOpcaoController(){
		this.sc = new Scanner(System.in);
	}
	
	//Método que define as escolhas feitas no MenuOpcao
	public void efetuaEscolha(int escolha) {
		switch(escolha) {
		case 1:
			int opcao = -1;
			do {
				System.out.println("Você é uma:");
				System.out.println("1 - Pessoa Fisica");
				System.out.println("2 - Pessoa Juridica");
				System.out.println("Digite sua Escolha: ");
				opcao = sc.nextInt();
				switch(opcao) {
				case 1:
					CadastroPF cadastroPF = new CadastroPF();
					cadastroPF.cadastro();
					break;
				case 2:
					CadastroPJ cadastroPJ = new CadastroPJ();
					cadastroPJ.cadastro();
					break;
				}
				
			}while(opcao < 1 || opcao > 2);
			break;
		case 2:
			int opcao2 = -1;
			do {
				System.out.println("Você é uma:");
				System.out.println("1 - Pessoa Fisica");
				System.out.println("2 - Pessoa Juridica");
				System.out.println("Digite sua Escolha: ");
				opcao2 = sc.nextInt();
				switch(opcao2) {
				case 1:
					
					System.out.println("Digite seu CPF: ");
					
					
					break;
				case 2:
					System.out.println("Digite seu CNPJ: ");
					
					break;
				}
				
			}while(opcao2 < 1 || opcao2 > 2);
			break;
		default:
			System.out.println("Ocorreu um erro no programa: ");
			break;
		}
	}
}
