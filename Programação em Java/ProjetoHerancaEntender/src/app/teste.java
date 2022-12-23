package app;

public class teste {

	public static void main(String[] args) {
		//Dormir não tem na classe cachorro, mas como ela herdou os atributos de ANIMAIS, ele consegue 
		//acessar o método dormir
		Cachorro c1 = new Cachorro();
		c1.dormir();
		c1.raca = "Pastor Alemão";
		c1.peso = 10;
	}

}
