package app;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
//		ArrayList<Aluno> a1 = new ArrayList<>();
		
		ListaAlunos l1 = new ListaAlunos();
		int op = 1;
		
		do {
			Aluno alunoCadastrado = new Aluno();
			System.out.println("Digite o nome do aluno: ");
			alunoCadastrado.setNome(sc.next());
					
			System.out.println("Digite a matricula do aluno: ");
			alunoCadastrado.setMatricula(sc.nextInt());
			
			System.out.println("Digite 1 para continuar ou 0 para parar:  ");
			op = sc.nextInt();
			
			
			
			l1.adicionarAluno(alunoCadastrado);
			
		}while(op > 0);
		
			
		

		System.out.println(l1.getAlunos());
		

		
	}
}
