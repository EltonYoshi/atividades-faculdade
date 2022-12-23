package app;

import java.text.ParseException;
import java.util.Scanner;
public class FuncaoCadastroEventoPublico {
	private ArmazenamentoEventosPublicos armazenamentoDeEventos;
	
	private Scanner sc;
	
	//M�todo Construtor
	public FuncaoCadastroEventoPublico() {
		this.armazenamentoDeEventos = new ArmazenamentoEventosPublicos();
		this.sc = new Scanner(System.in);
	}
	
	//M�todo que verifica se a hora de in�cio do evento foi digitada com a formata��o correta
	public void verificacaoHoraInicio(EventoPublico evento) {
		boolean feito = false;
		while(!feito) {
			try {
				evento.setHorarioInicio(sc.nextLine());
				feito = true;
			} catch (ParseException e) {
				System.out.println("Utilize a nota��o horas:minutos");
			}
		}
		
	}
	
	//M�todo que verifica se a hora de t�rmino do evento foi digitada com a formata��o correta
	public void verificacaoHoraTermino(EventoPublico evento) {
		boolean feito = false;
		while(!feito) {
			try {
				evento.setHorarioTermino(sc.nextLine());
				feito = true;
			} catch (ParseException e) {
				System.out.println("Utilize a nota��o: horas:minutos, por exemplo, 21:34");
			}
		}
	}
	
	//M�todo que verifica se a data do evento foi digitada com a formata��o correta
	public void verificacaoData(EventoPublico evento) {
		boolean feito = false;
		while(!feito) {
			try {
				evento.setData(sc.nextLine());
				feito = true;
			} catch (ParseException e) {
				
				System.out.println("Utilize a nota��o: dia/m�s/ano, por exemplo, 24/09/2003");
			}
		}
		
		
	}
	
	//M�todo que retorna um question�rio para o usu�rio cadastrar um evento P�BLICO
	public void telaCadastroDoEvento(){
		EventoPublico evento = new EventoPublico();
		System.out.println("Nome do Evento: ");
		evento.setNome(sc.nextLine());
		
		System.out.println("Endere�o: ");
		evento.setEndereco(sc.nextLine());
		
		System.out.println("Data: ");
		verificacaoData(evento);
		
		System.out.println("Horario de Inicio: ");
		verificacaoHoraInicio(evento);
		
		System.out.println("Horario de T�rmino: ");
		verificacaoHoraTermino(evento);
		
		System.out.println("Descri��o: ");
		evento.setDescricao(sc.nextLine());
		
		//M�todo que recebe o objeto evento cadastrado e o armazena
		armazenamentoDeEventos.armazenarEvento(evento);
	}

	//M�todo que retorna o objeto de armazenamento do eventos P�BLICOS
	public ArmazenamentoEventosPublicos getArmazenamentoDeEventos() {
		return armazenamentoDeEventos;
	}
	
}
