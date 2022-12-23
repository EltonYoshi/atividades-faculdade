package app;

import java.util.Scanner;

public class FuncaoCadastroUsuario {
	private ArmazenamentoUsuario armazenamentoDoUsuario;
	private Scanner sc;
	
	public FuncaoCadastroUsuario() {
		this.armazenamentoDoUsuario = new ArmazenamentoUsuario();
		this.sc = new Scanner(System.in);
	}
	
	public void telaCadastroDoUsuario() {
		Usuario usuario = new Usuario();
		System.out.println("Nome do Usuario: ");
		usuario.setNome(sc.nextLine());
		
		System.out.println("Email: ");
		usuario.setEmail(sc.nextLine());
		
		System.out.println("CPF: ");
		usuario.setCpf(Double.parseDouble(sc.nextLine()));
	
	
		armazenamentoDoUsuario.armazenarUsuario(usuario);
	}

	public ArmazenamentoUsuario getArmazenamentoDoUsuario() {
		return armazenamentoDoUsuario;
	}

	

	
}

