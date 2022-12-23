package app;
import java.util.ArrayList;

/*Essa classe tem como objetivo: armazenar em um ArrayList os usuários cadastrados no sistema*/

public class ArmazenamentoUsuario {
	private ArrayList<Usuario> armazenamento;
	
	//Método Construtor
	public ArmazenamentoUsuario() {
		this.armazenamento = new ArrayList<>();
	}
	
	
	public ArrayList<Usuario> getArmazenamento() {
		return armazenamento;
	}

	//Método para armazenar um usuário dentro do ArrayList
	public void armazenarUsuario(Usuario usuario) {
		armazenamento.add(usuario);
	}
	
}
