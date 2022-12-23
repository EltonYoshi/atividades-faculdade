package app;
import java.util.ArrayList;

/*Essa classe tem como objetivo: armazenar em um ArrayList os usu�rios cadastrados no sistema*/

public class ArmazenamentoUsuario {
	private ArrayList<Usuario> armazenamento;
	
	//M�todo Construtor
	public ArmazenamentoUsuario() {
		this.armazenamento = new ArrayList<>();
	}
	
	
	public ArrayList<Usuario> getArmazenamento() {
		return armazenamento;
	}

	//M�todo para armazenar um usu�rio dentro do ArrayList
	public void armazenarUsuario(Usuario usuario) {
		armazenamento.add(usuario);
	}
	
}
