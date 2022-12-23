package app;

import java.util.ArrayList;
public class Main {


	public static void main(String[] args) {
		

		
		//id, descrição, pisoSalarial
		Cargo prof  = new Cargo(1, "Professor N1", 1200f);
		
		//id, descrição
		Departamento depAcademico = new Departamento(1, "Acadêmico");
		
		//id, matricula, nome, salario
		Funcionario f1 = new Funcionario(1, 123, "Jean", 200f, prof);
		
		
		ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
		
		
		listaFuncionario.add(f1);
		
		//aqui ele vai setar os cargos e departamentos, sendo que cada um tem os atributos de descrição e ID
		//afinal o cargo e departamento se tornaram classes
		f1.setDepartamento(depAcademico);
		
		//eu tenho que gettar cargo para pegar os métodos dele
		System.out.println(f1.getCargo().getDescricao() + " R$ " + f1.getSalario() + " Departamento: " + f1.getDepartamento().getId());
		
		

	}

}
