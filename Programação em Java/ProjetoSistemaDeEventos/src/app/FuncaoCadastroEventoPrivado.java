package app;

import java.text.ParseException;
import java.util.Scanner;

public class FuncaoCadastroEventoPrivado {
	private ArmazenamentoEventosPrivados armazenamentoDeEventos;
	private Scanner sc;
	
	//M?todo Construtor
	public FuncaoCadastroEventoPrivado() {
		this.armazenamentoDeEventos = new ArmazenamentoEventosPrivados();
		this.sc = new Scanner(System.in);
	}
	
	//M?todo que verifica se a hora de in?cio do evento foi digitada com a formata??o correta
	public void verificacaoHoraInicio(EventoPrivado evento) {
		boolean feito = false;
		while(!feito) {
			try {
				evento.setHorarioInicio(sc.nextLine());
				feito = true;
			} catch (ParseException e) {
				System.out.println("Utilize a nota??o horas:minutos");
			}
		}
		
	}
	
	//M?todo que verifica se a hora de t?rmino do evento foi digitada com a formata??o correta
	public void verificacaoHoraTermino(EventoPrivado evento) {
		boolean feito = false;
		while(!feito) {
			try {
				evento.setHorarioTermino(sc.nextLine());
				feito = true;
			} catch (ParseException e) {
				System.out.println("Utilize a nota??o: horas:minutos, por exemplo, 21:34");
			}
		}
	}
	
	//M?todo que verifica se a data do evento foi digitada com a formata??o correta
	public void verificacaoData(EventoPrivado evento) {
		boolean feito = false;
		while(!feito) {
			try {
				evento.setData(sc.nextLine());
				feito = true;
			} catch (ParseException e) {
				
				System.out.println("Utilize a nota??o: dia/m?s/ano, por exemplo, 24/09/2003");
			}
		}
		
		
	}
	
	//M?todo que retorna um question?rio para o usu?rio cadastrar um evento PRIVADO
	public void telaCadastroDoEvento(){
		EventoPrivado evento = new EventoPrivado();
		
		System.out.println("Nome do Evento: ");
		evento.setNome(sc.nextLine());
		
		
		System.out.println("Endere?o: ");
		evento.setEndereco(sc.nextLine());
		
		System.out.println("Data: ");
		verificacaoData(evento);
		
		System.out.println("Horario de Inicio: ");
		verificacaoHoraInicio(evento);
		
		
		System.out.println("Horario de T?rmino: ");
		verificacaoHoraTermino(evento);
		
		
		System.out.println("Descri??o: ");
		evento.setDescricao(sc.nextLine());
		
		//M?todo que recebe o objeto evento cadastrado e o armazena
		armazenamentoDeEventos.armazenarEvento(evento);
		
	}
	
	//M?todo que retorna o objeto de armazenamento do eventos P?BLICOS
	public ArmazenamentoEventosPrivados getArmazenamentoDeEventos() {
		return armazenamentoDeEventos;
	}
	
	//M?todo que mostra todos os usu?rios cadastrados no sistema
	public void mostrarUsuario(ArmazenamentoUsuario usuarios) {
		for(int i = 0; i < usuarios.getArmazenamento().size(); i++) {
			System.out.println("Usu?rio - " + (i+1) + "\n" + usuarios.getArmazenamento().get(i).getNome() +
					"\n" + usuarios.getArmazenamento().get(i).getEmail() + "\n");
		}
	}
	
	//M?todo que permite o usu?rio convidar outros usu?rios para seu evento PRIVADO
	public void cadastrarConvidado(ArmazenamentoUsuario usuarios, ArmazenamentoEventosPrivados eventos) {
		if (usuarios.getArmazenamento().size() > 0) {
			System.out.println("\n CONVIDE USU?RIOS: ");
			mostrarUsuario(usuarios);
			
			System.out.println("Usu?rio escolhido: ");
			int escolha = Integer.parseInt(sc.nextLine()) - 1;
			
			for(int i = 0; i < eventos.getArmazenamento().size(); i++) {
				
				for(int j = 0; j < usuarios.getArmazenamento().size(); j++) {
					if(escolha == j) {
						eventos.getArmazenamento().get(i).adicionarUsuarioEvento(usuarios.getArmazenamento().get(j));
					}
					
				}
			}
		}else {
			System.out.println("N?o h? nenhum usu?rio cadastrado no sistema!");
		}
	}
	
	


	
	
}
