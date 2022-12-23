
import java.util.ArrayList;
public class armazenamentoGeral {
	private ArrayList<Usuario> armazenamentoUsuario;

	public armazenamentoGeral() {
		this.armazenamentoUsuario = new ArrayList<>();
	}
	
	public void armazenarUsuario(Usuario usuario) {
		armazenamentoUsuario.add(usuario);
	}
	
	
	
	
}
