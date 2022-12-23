package app;

/*
 * Considerando que voc� tem uma classe para animais que possuem os atributos abaixo,
 * voc� n�o � obrigado a reescrever esses mesmos atributos quando voc� criar uma classe cachorro por exemplo.
 * Isso funcionaria para PESSOA, PESSOA FISICA e PESSOA JURIDICA, sendo que PF possui os mesmo atributos de PESSOA
 * mais o CPF, enquanto que a juridica possui CNPJ
 * */
public class Animal {
	public String raca;
	public double peso;
	
	public void dormir() {
		System.out.println("zzzzzzzzzzz");
	}
}
