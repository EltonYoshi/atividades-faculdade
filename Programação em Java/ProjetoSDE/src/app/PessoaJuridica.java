package app;

public class PessoaJuridica extends Usuario {
	private double cnpj;
	
	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}
	
	public double getCnpj() {
		return this.cnpj;
	}

	@Override
	public String toString() {
		return  "Nome: " + super.getNome() +"\nCNPJ: "+ this.cnpj + "\nEmail: " + super.getEmail()
				+ "\nEventos: " + super.getArmazenamentoEvento();
	}
	
	
	
	
	
}
