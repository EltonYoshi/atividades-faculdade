package app;

/*
 * De forma bem resumida, um super � um construtor que herda os valores da classe PAI.
 * Por�m ele tamb�m serve para herdar m�todos diretamente da classe PAI, escrevendo
 * super.nomeDoM�todo ai ele ir� chamar esse m�todo na subclasse desejada
 * 
 * */
public class Animal {
	String raca;
	int peso;
	
	public Animal (String raca, int peso) {
		this.raca = raca;
		this.peso = peso;
	}
}
