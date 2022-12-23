package app;

public class Produto {
	private String nome;
	private int quantidade;
	private double valorUnitario;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	public double calcularTotal() {
		return this.quantidade * this.valorUnitario;
	}
	
	
	@Override
	public String toString() {
		return "Nome do produto: " + this.nome + "\nCusto R$ " + this.valorUnitario + 
				"\nQuantidade: " + this.quantidade + " unidade(s)";
	}
	
	
	
	
}
