
public class pessoaJuridica extends Usuario{
	private int cnpj;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return "Usuario: " + super.getNome() + "\nCpf: " + cnpj + "\nEmail: " + getEmail() + "\nEventos:"+ super.getArmazenamentoEvento() ;
	}
}
