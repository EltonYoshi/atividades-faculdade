package app;
import java.util.ArrayList;


public class ListaMedicamentos {
	ArrayList<Medicamento> lista;

	public ListaMedicamentos() {
		this.lista = new ArrayList<>();
	}

	
	
	public ArrayList<Medicamento> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Medicamento> lista) {
		this.lista = lista;
	}
	
	public void adicionarLista(Medicamento m1) {
		this.lista.add(m1);
	}
	
	public Medicamento mostrarMedicamento (int medicamento) {
		return this.lista.get(medicamento);
	}
	public int mostrarNumeroDeMedicamentos() {
		return this.lista.size();
	}
	
	
	


	@Override
	public String toString() {
		return "ListaMedicamentos lista: " + this.lista;
	}
	
	
}
