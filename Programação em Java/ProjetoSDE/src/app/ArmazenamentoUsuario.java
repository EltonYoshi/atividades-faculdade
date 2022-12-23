package app;
import java.util.ArrayList;
public class ArmazenamentoUsuario {
	private ArrayList<PessoaFisica> armazenamentoDePessoaFisica;
	private ArrayList<PessoaJuridica> armazenamentoDePessoaJuridica;
	
	
	public ArmazenamentoUsuario() {
		this.armazenamentoDePessoaFisica = new ArrayList<>();
		this.armazenamentoDePessoaJuridica = new ArrayList<>();
	}
	
	
	
	public ArrayList<PessoaFisica> getArmazenamentoDePessoaFisica() {
		return armazenamentoDePessoaFisica;
	}


	public ArrayList<PessoaJuridica> getArmazenamentoDePessoaJuridica() {
		return armazenamentoDePessoaJuridica;
	}


	public void armazenarPessoaFisica(PessoaFisica pf) {
		this.armazenamentoDePessoaFisica.add(pf);
	}
	
	public void armazenarPessoaJuridica(PessoaJuridica pj) {
		this.armazenamentoDePessoaJuridica.add(pj);
	}
	
}
