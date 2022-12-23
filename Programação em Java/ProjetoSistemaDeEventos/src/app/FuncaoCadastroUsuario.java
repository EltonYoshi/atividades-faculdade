package app;

import java.util.Scanner;

public class FuncaoCadastroUsuario {
	private ArmazenamentoUsuario armazenamentoDoUsuario;
	private Scanner sc;
	
	//M�todo Construtor
	public FuncaoCadastroUsuario() {
		this.armazenamentoDoUsuario = new ArmazenamentoUsuario();
		this.sc = new Scanner(System.in);
	}
	
	//M�todo que retorna um question�rio para o usu�rio cadastrar seus dados no sistema
	public void telaCadastroDoUsuario() {
		Usuario usuario = new Usuario();
		System.out.println("Nome do Usuario: ");
		usuario.setNome(sc.nextLine());
		
		System.out.println("Email: ");
		usuario.setEmail(sc.nextLine());
		
		System.out.println("CPF: ");
		usuario.setCpf(Double.parseDouble(sc.nextLine()));
	
		//M�todo que recebe o objeto usu�rio cadastrado e o armazena
		armazenamentoDoUsuario.armazenarUsuario(usuario);
		
	}

	//M�todo que retorna o objeto de armazenamento do usu�rio
	public ArmazenamentoUsuario getArmazenamentoDoUsuario() {
		return armazenamentoDoUsuario;
	}

	

	
}

