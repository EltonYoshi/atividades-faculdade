package app;
import java.util.ArrayList;

public class listaDeCompra {
	private ArrayList<produto> lista;

	public listaDeCompra() {
		
		this.lista = new ArrayList<>();
	}

	public ArrayList<produto> getLista() {
		return lista;
	}
	
	//adicionar produto
	public void adicionarProduto(produto p1) {
		this.lista.add(p1);
	}
	
	//limpar lista
	public void limparLista() {
		this.lista.clear();
	}
	
	public int obterQuantidadeDeProduto() {
		return lista.size();
	}
	
	public double calcularTotalDaLista() {
		double soma = 0;
		for (int i = 0; i < this.lista.size(); i++) {
			soma = soma + lista.get(i).calcularTotal();
		}
		return soma;
		
	}

	@Override
	public String toString() {
		return "listaDeCompra [lista=" + lista + "]";
	}
	
	
	
	
	
}
