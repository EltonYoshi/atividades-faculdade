package app;

import java.util.ArrayList;
public class ListaAlunos {
	ArrayList<Aluno> alunos;

	public ListaAlunos() {
		this.alunos = new ArrayList<Aluno>();
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void adicionarAluno(Aluno a1) {
		this.alunos.add(a1);

	} 
	
	
	
}
