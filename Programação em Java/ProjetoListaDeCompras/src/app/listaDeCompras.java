package app;

import java.util.ArrayList;
public class listaDeCompras {
	private ArrayList<Produto> lista;


	//construtor
	public listaDeCompras() {
		this.lista = new ArrayList<>();

	}

	
	public ArrayList<Produto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Produto> lista) {
		this.lista = lista;
	}

	//metodo para criar um produto
	public void adicionarProduto(Produto p1) {
		this.lista.add(p1);
		
	}
	
	//metodo para reiniciar a lista
	public void apagarTudo() {
		this.lista.clear();
		
	}
	
	//metodo para ver quantos produtos tem na lista
	public int obterQuantidadeDeProdutos() {
		return this.lista.size();
	}

	
	public double calcularTotalDaLista() {
		
		double soma = 0;
		for(int i = 0; i < this.lista.size(); i++) {
			/*Aqui ele está pegando os valores da lista do calcular total
			 * e vai somar cada i com o anterior e assim por diante */
			soma = soma + lista.get(i).calcularTotal();
		}
		//rever isso
		return soma;
	}
	
	@Override
	public String toString() {
		return "listaDeCompras {" + "lista: " + this.lista + "}";
	}
	
	
	
	
	
	
	
}
