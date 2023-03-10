package app;

import java.io.IOException;
import java.util.Scanner;
public class MenuOpcaoController {
	private Scanner sc;
	private FuncaoCadastroEventoPublico cadastroEvento;
	private FuncaoCadastroEventoPrivado cadastroEventoPrivado;
	private FuncaoCadastroUsuario cadastroUsuario;
		
	//M?todo Construtor
	public MenuOpcaoController() {
		this.sc = new Scanner(System.in);
		this.cadastroEvento = new FuncaoCadastroEventoPublico();
		this.cadastroUsuario = new FuncaoCadastroUsuario();
		this.cadastroEventoPrivado = new FuncaoCadastroEventoPrivado();
	}

	
	// M?todo voltado para caso o usu?rio deseje adicionar mais um conviadado em seu EVENTO PRIVADO
	public void convidarOutroPrivado() {
		
		//Loop que repete o cadastramento de diferentes usu?rios no evento
		int esc = 0;
		do {
			cadastroEventoPrivado.cadastrarConvidado(cadastroUsuario.getArmazenamentoDoUsuario(), 
					cadastroEventoPrivado.getArmazenamentoDeEventos());
			System.out.println("Deseja convidar outro usu?rio?");
			System.out.println("1 - Sim");
			System.out.println("0 - N?o");
			System.out.println("Escolha: ");
			esc = Integer.parseInt(sc.nextLine());
		}while(esc == 1);
	}
	
	
	/*M?dodo que recebe a escolha da Classe MenuOpcao e executa condi??es conforme 
	 * o valor da vari?vel escolha*/
	public void efetuaEscolha(int escolha) {
		switch(escolha){
		case 1:
			
			/*A ideia dessa fun??o ? dar a possibilidade do usu?rio realizar
			 * seu cadastro no sistema*/
			System.out.println("\nCADASTRO DO USU?RIO: \n");
			cadastroUsuario.telaCadastroDoUsuario();
			System.out.println("\nCadastro conclu?do com sucesso!\n");
			
			break;
		case 2:
			
			/*Loop para confirmar que o usu?rio n?o ir? colocar 
			 * um valor maior ou menor que os informados nas op??es*/
			int op = 0;
			do {
				/*Menu de escolha para definir se a categoria do EVENTO,
				 * ser? PRIVADA ou P?BLICA*/
				
				System.out.println("\nQual categoria de evento voc? deseja?\n");
				System.out.println("1 - P?blico");
				System.out.println("0 - Privado");
				System.out.println("Escolha: ");
				op = Integer.parseInt(sc.nextLine());
				
			}while(op < 0 || op > 1 );
			
			/*Estrutura de condi??o que depende do valor escolhido pelo usu?rio no
			 * loop a cima*/
			
			if(op == 1) {
				System.out.println("\nCADASTRO DE EVENTO P?BLICO: \n");
				//Retorna uma tela para o cadastro de EVENTOS P?BLICOS
				cadastroEvento.telaCadastroDoEvento();
				System.out.println("\nEvento p?blico criado com sucesso!\n");
				
			} else if(op == 0) {
				//Retorna uma tela para o cadastro de EVENTOS PRIVADOS
				System.out.println("\nCADASTRO DE EVENTO PRIVADO: \n");
				cadastroEventoPrivado.telaCadastroDoEvento();
				
				//Retorna o m?todo que permite o usu?rio convidar outro usu?rio para seu EVENTO PRIVADO
				convidarOutroPrivado();
				System.out.println("\nEvento privado criado com sucesso!\n");
				
			}
			
			
			break;
		case 3:
			
			/*A ideia dessa fun??o ? dar a possibilidade do usu?rio
			 * participar de um EVENTO P?BLICO*/
			FuncaoParticiparEvento participarEvento = new FuncaoParticiparEvento(cadastroEvento.getArmazenamentoDeEventos(),
					cadastroUsuario.getArmazenamentoDoUsuario());
			
			//Retorna os EVENTOS P?BLICOS dispon?veis para o usu?rio se cadastrar
			participarEvento.mostrarEventos();
			
			//Retorna um menu escolha para o usu?rio escolher um EVENTO P?BLICO
			participarEvento.escolherEvento();
			break;
			
		case 4:
			
			/*A ideia dessa fun??o ? dar a possibilidade do usu?rio consultar
			 * os EVENTOS P?BLICOS que ele se cadastrou*/
			FuncaoEventosDoUsuario eventosDoUsuario = new FuncaoEventosDoUsuario(cadastroEvento.getArmazenamentoDeEventos());
			
			//Retorna os EVENTOS P?BLICOS que o usu?rio est? cadastrado
			eventosDoUsuario.mostrarEventosDoUsuario();
			
			//Retorna um menu de op??es que permite o cancelamento do cadastro em um evento
			eventosDoUsuario.cancelarParticipacao();
			
			break;
			
		case 5:
			
			/*A ideia dessa fun??o ? dar a possibilidade do usu?rio consultar
			 * os EVENTOS PRIVADOS que ele foi convidado*/
			FuncaoMostrarEventosPrivados mostrarEventosPrivados = new FuncaoMostrarEventosPrivados(cadastroEventoPrivado.getArmazenamentoDeEventos());
			
			//Retorna os EVENTOS PRIVADO que o usu?rio foi convidado
			mostrarEventosPrivados.mostrarEventosDoUsuario();
			
			break;
			
		case 6:
			
			/*A ideia dessa fun??o ? dar a possibilidade do usu?rio consultar todos os 
			 * EVENTOS P?BLICOS que v?o ocorrer, ocorreram e est?o ocorrendo*/
			
			FuncaoMostrarEventosPublicos mostrarEventosPublicos = new FuncaoMostrarEventosPublicos(cadastroEvento.getArmazenamentoDeEventos());
			
			//Retorna eventos que j? aconteceram
			mostrarEventosPublicos.eventosOcorridos();
			
			//Retorna eventos que v?o acontecer
			mostrarEventosPublicos.eventosOcorrer();
			
			//Retorna eventos que est?o ocorrendo no momento da execu??o do programa
			mostrarEventosPublicos.eventosOcorrendo();
			
			break;
		case 0:
			System.exit(0);
			break;
			
		default:
			System.out.println("Op??o Inv?lida");
			break;
		}
		
	}


}
