package app;

public class PessoaFisica extends Usuario{
	private double cpf;
	
	
	
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}



	@Override
	public String toString() {
		return  "Nome: " + super.getNome() +"\nCNPJ: "+ this.cpf + "\nEmail: " + super.getEmail()
				+ "\nEventos: " + super.getArmazenamentoEvento();
	}
}
