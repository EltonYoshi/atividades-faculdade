package app;

/*
 * O super é feito justamento para herdar os atributos raça e peso que estão
 * dentro do construtor da classe ANIMAL, afinal, Cachorro é uma subclasse de ANIMAl
 * logo ele é obrigado a herdar os atributos de ANIMAL na hora de passar os parâmetros da
 * instancia
 * */
public class Cachorro extends Animal{
	
	public Cachorro(String raca, int peso) {
		super(raca, peso);
		
	}
	
}
