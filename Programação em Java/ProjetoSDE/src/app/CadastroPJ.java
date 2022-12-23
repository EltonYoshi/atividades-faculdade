package app;
import java.util.Scanner;

public class CadastroPJ extends Cadastro{
	private PessoaJuridica pj;
	private Scanner sc;
	
	public CadastroPJ() {
		this.pj = new PessoaJuridica();
		this.sc = new Scanner(System.in);
	}
	
	
	public void cadastro() {
		System.out.println("Seu Nome:");
		pj.setNome(sc.nextLine());
		
		System.out.println("Seu CNPJ: ");
		pj.setCnpj(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Seu email: ");
		pj.setEmail(sc.nextLine());
		
		System.out.println("Nome do Evento: ");
		super.getEvento().setNome(sc.nextLine());
		
		System.out.println("Endereço do Evento: ");
		super.getEvento().setEndereco(sc.nextLine());
		
		System.out.println("Horario do Evento: ");
		super.getEvento().setHorario(Integer.parseInt(sc.nextLine()));
		
		pj.armazenarEvento(super.getEvento());
		super.getArmazenaUsuario().armazenarPessoaJuridica(pj);
	}

}
