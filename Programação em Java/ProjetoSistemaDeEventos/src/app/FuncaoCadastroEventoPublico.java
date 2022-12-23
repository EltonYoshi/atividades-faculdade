package app;

import java.text.ParseException;
import java.util.Scanner;
public class FuncaoCadastroEventoPublico {
	private ArmazenamentoEventosPublicos armazenamentoDeEventos;
	
	private Scanner sc;
	
	//Método Construtor
	public FuncaoCadastroEventoPublico() {
		this.armazenamentoDeEventos = new ArmazenamentoEventosPublicos();
		this.sc = new Scanner(System.in);
	}
	
	//Método que verifica se a hora de início do evento foi digitada com a formatação correta
	public void verificacaoHoraInicio(EventoPublico evento) {
		boolean feito = false;
		while(!feito) {
			try {
				evento.setHorarioInicio(sc.nextLine());
				feito = true;
			} catch (ParseException e) {
				System.out.println("Utilize a notação horas:minutos");
			}
		}
		
	}
	
	//Método que verifica se a hora de término do evento foi digitada com a formatação correta
	public void verificacaoHoraTermino(EventoPublico evento) {
		boolean feito = false;
		while(!feito) {
			try {
				evento.setHorarioTermino(sc.nextLine());
				feito = true;
			} catch (ParseException e) {
				System.out.println("Utilize a notação: horas:minutos, por exemplo, 21:34");
			}
		}
	}
	
	//Método que verifica se a data do evento foi digitada com a formatação correta
	public void verificacaoData(EventoPublico evento) {
		boolean feito = false;
		while(!feito) {
			try {
				evento.setData(sc.nextLine());
				feito = true;
			} catch (ParseException e) {
				
				System.out.println("Utilize a notação: dia/mês/ano, por exemplo, 24/09/2003");
			}
		}
		
		
	}
	
	//Método que retorna um questionário para o usuário cadastrar um evento PÚBLICO
	public void telaCadastroDoEvento(){
		EventoPublico evento = new EventoPublico();
		System.out.println("Nome do Evento: ");
		evento.setNome(sc.nextLine());
		
		System.out.println("Endereço: ");
		evento.setEndereco(sc.nextLine());
		
		System.out.println("Data: ");
		verificacaoData(evento);
		
		System.out.println("Horario de Inicio: ");
		verificacaoHoraInicio(evento);
		
		System.out.println("Horario de Término: ");
		verificacaoHoraTermino(evento);
		
		System.out.println("Descrição: ");
		evento.setDescricao(sc.nextLine());
		
		//Método que recebe o objeto evento cadastrado e o armazena
		armazenamentoDeEventos.armazenarEvento(evento);
	}

	//Método que retorna o objeto de armazenamento do eventos PÚBLICOS
	public ArmazenamentoEventosPublicos getArmazenamentoDeEventos() {
		return armazenamentoDeEventos;
	}
	
}
