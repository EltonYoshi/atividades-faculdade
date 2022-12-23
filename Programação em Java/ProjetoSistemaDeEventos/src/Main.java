
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Eventos evento = new Eventos();
		pessoaFisica pessoaFisica = new pessoaFisica();
		armazenamentoGeral armazenamentoUsuario = new armazenamentoGeral();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		pessoaFisica.setNome(sc.nextLine());
		
		System.out.println("Cpf: ");
		pessoaFisica.setCpf(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Nome do Evento: ");
		evento.setNome(sc.nextLine());
		
		System.out.println("Endereço do evento: ");
		evento.setEndereco(sc.nextLine());
		
		
		pessoaFisica.armazenarEvento(evento);
		armazenamentoUsuario.armazenarUsuario(pessoaFisica);
		
		System.out.println(pessoaFisica);
		
		
	}

}
