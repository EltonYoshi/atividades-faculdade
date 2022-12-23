package app;

import java.util.Arrays;

public class Treino {
	private String nome;
	private double[] marcas;
	
	
	
	
	public Treino() {
		this.marcas = new double[10];
	}

	// o método get é usado buscar os dados
	public String getNome() {
		return nome;
	}
	
	// o método set é usado para alterar os dados
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getMarcas() {
		return marcas;
	}
	public void setMarcas(double[] marcas) {
		this.marcas = marcas;
	}
	
	
	/*
	 * O Método "armazenarMarca" recebe o número da
	 * marca por argumento e também a marca que será
	 * armazenada. O número que representa a marca
	 * Se o número for maior ou igual a 0 e menor que a 
	 * quantidade de elementos, ele armazena a marca no 
	 * número especificado.
	 * */
	public void armazenarMarca(int numero, double marca) {
		if(numero >= 0 && numero < this.marcas.length) {
			this.marcas[numero] = marca;
		}
	}
	

	public double calcularMediaDeMarcas() {
		double soma = 0;
		/*percorre as marcas e soma elas e armazena
		 * na variável soma
		 * */
		for(int i = 0; i < this.marcas.length; i++) {
			soma = soma + this.marcas[i];
		}
		// faz a média
		return soma/marcas.length;
	}
	
	public double obterMaiorMarca() {
		
		
		double maior = this.marcas[0];
		
		for(int i = 0; i < this.marcas.length; i++){
			/*Se for maior que a primeira posição
			 * a variavel maior passará a ser 
			 * o valor de marcas da posição [i] */
			if(this.marcas[i] > maior) {
				maior = this.marcas[i];
			}
		}
		return maior;
	}

	@Override
	public String toString() {
		return "Nome=" + this.nome + "\nMarcas=" + Arrays.toString(this.marcas) ;
	}
	
	
	
	
}
