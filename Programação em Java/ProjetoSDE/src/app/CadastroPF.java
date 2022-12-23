package app;
import java.util.Scanner;
public class CadastroPF extends Cadastro{
	private PessoaFisica pf;
	private Scanner sc;
	
	public CadastroPF() {
		super();
		this.pf = new PessoaFisica();
		this.sc = new Scanner(System.in);
	}

	public void cadastro() {
		System.out.println("Seu Nome:");
		pf.setNome(sc.nextLine());
		
		System.out.println("Seu CPF: ");
		pf.setCpf(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Seu email: ");
		pf.setEmail(sc.nextLine());
		
		System.out.println("Nome do Evento: ");
		super.getEvento().setNome(sc.nextLine());
		
		System.out.println("Endereço do Evento: ");
		super.getEvento().setEndereco(sc.nextLine());
		
		System.out.println("Horario do Evento: ");
		super.getEvento().setHorario(Integer.parseInt(sc.nextLine()));
		
		pf.armazenarEvento(super.getEvento());
		super.getArmazenaUsuario().armazenarPessoaFisica(pf);
		System.out.println(super.getArmazenaUsuario());
		
	}

}
