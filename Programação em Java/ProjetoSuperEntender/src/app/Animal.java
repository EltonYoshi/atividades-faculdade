package app;

/*
 * De forma bem resumida, um super é um construtor que herda os valores da classe PAI.
 * Porém ele também serve para herdar métodos diretamente da classe PAI, escrevendo
 * super.nomeDoMétodo ai ele irá chamar esse método na subclasse desejada
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
