package app;

/*
 * O super � feito justamento para herdar os atributos ra�a e peso que est�o
 * dentro do construtor da classe ANIMAL, afinal, Cachorro � uma subclasse de ANIMAl
 * logo ele � obrigado a herdar os atributos de ANIMAL na hora de passar os par�metros da
 * instancia
 * */
public class Cachorro extends Animal{
	
	public Cachorro(String raca, int peso) {
		super(raca, peso);
		
	}
	
}
