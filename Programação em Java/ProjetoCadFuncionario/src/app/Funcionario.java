package app;

public class Funcionario {
	private int id;
	private int matricula;
	private String nome;
	private float salario;
	private Cargo cargo;
	private Departamento departamento;
	
	
	

	public Funcionario(int id, int matricula, String nome, float salario, Cargo cargo) {
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
		if (this.salario < this.cargo.getPisoSalarial()) {
			//isso é para quando o funcionário tiver um salário menor do que o pisoSalarial
			//que automaticamente será trocado pelo piso
			this.salario = cargo.getPisoSalarial();
		}
	}

	public int getId() {
		return id;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	
	
}
