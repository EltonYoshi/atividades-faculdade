package app;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\medicamento.csv");
		
		//Scanners
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		//Objetos
		String linhasDoArquivo = new String();
		ListaMedicamentos l1 = new ListaMedicamentos();
		Funcionalidades f1 = new Funcionalidades();
		
		//Vari�veis
		int opcao;
		
		
		
		try {
			sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				
				linhasDoArquivo = sc.nextLine();
				String[] campos = linhasDoArquivo.split(";");
				if (campos.length >= 2) {
					Medicamento m1 = new Medicamento(campos[7],campos[1], campos[2],campos[3]);
					l1.adicionarLista(m1);
				}
				
			
			}
			
			sc.close();
		}
		
		catch (IOException e){
			
		}
		
		
		System.out.println(l1.mostrarMedicamento(3).getNome());
		
		System.out.println();
		System.out.println("Digite o nome do rem�dio: ");
		String medicamento = sc1.nextLine().toUpperCase();
		f1.procurarNome(medicamento, l1);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
