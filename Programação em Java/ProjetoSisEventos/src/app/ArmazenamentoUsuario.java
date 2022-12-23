package app;
import java.util.ArrayList;
public class ArmazenamentoUsuario {
	private ArrayList<Usuario> armazenamento;
	
	public ArmazenamentoUsuario() {
		this.armazenamento = new ArrayList<>();
	}
	
	
	public ArrayList<Usuario> getArmazenamento() {
		return armazenamento;
	}

	public void armazenarUsuario(Usuario usuario) {
		armazenamento.add(usuario);
	}
	
}
