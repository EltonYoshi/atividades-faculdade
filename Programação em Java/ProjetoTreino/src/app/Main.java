package app;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Treino t1 = new Treino();
		//System.out.println("Informe o nome do atleta: ");

		//t1.setNome(sc.nextLine());
		
		for(int i = 0; i < 10; i++){
			System.out.println("Informe a marca " + i + ": " );
			t1.armazenarMarca(i, sc.nextDouble());
		}
		
		//Esse t1 vai retornar o toString
		System.out.println(t1);
		double media = t1.calcularMediaDeMarcas();
		double maior = t1.obterMaiorMarca();
		
		System.out.println("Média de marcas: "+ media);
		System.out.println("Maior marca: "+ maior);
	}

}
