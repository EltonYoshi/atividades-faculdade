package app;

import java.util.Arrays;

public class Treino {
	private String nome;
	private double[] marcas;
	
	
	
	
	public Treino() {
		this.marcas = new double[10];
	}

	// o m�todo get � usado buscar os dados
	public String getNome() {
		return nome;
	}
	
	// o m�todo set � usado para alterar os dados
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
	 * O M�todo "armazenarMarca" recebe o n�mero da
	 * marca por argumento e tamb�m a marca que ser�
	 * armazenada. O n�mero que representa a marca
	 * Se o n�mero for maior ou igual a 0 e menor que a 
	 * quantidade de elementos, ele armazena a marca no 
	 * n�mero especificado.
	 * */
	public void armazenarMarca(int numero, double marca) {
		if(numero >= 0 && numero < this.marcas.length) {
			this.marcas[numero] = marca;
		}
	}
	

	public double calcularMediaDeMarcas() {
		double soma = 0;
		/*percorre as marcas e soma elas e armazena
		 * na vari�vel soma
		 * */
		for(int i = 0; i < this.marcas.length; i++) {
			soma = soma + this.marcas[i];
		}
		// faz a m�dia
		return soma/marcas.length;
	}
	
	public double obterMaiorMarca() {
		
		
		double maior = this.marcas[0];
		
		for(int i = 0; i < this.marcas.length; i++){
			/*Se for maior que a primeira posi��o
			 * a variavel maior passar� a ser 
			 * o valor de marcas da posi��o [i] */
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
