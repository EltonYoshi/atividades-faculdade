
public class pessoaFisica extends Usuario {
	private int cpf;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Usuario: " + super.getNome() + "\nCpf: " + cpf + "\nEmail: " + getEmail() + "\nEventos:"+ super.getArmazenamentoEvento() ;
	}

}
