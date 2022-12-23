package app;

public class usaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Moises Bosta De Gordo");
		f1.setRg("234.456.56");
		f1.setCartao("RGA3455");
		f1.setCnpj("RRRRR#323432424");
		
		System.out.println(f1.getNome());
	}

}
