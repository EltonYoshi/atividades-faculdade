package app;

public class teste {

	public static void main(String[] args) {
		//Dormir n�o tem na classe cachorro, mas como ela herdou os atributos de ANIMAIS, ele consegue 
		//acessar o m�todo dormir
		Cachorro c1 = new Cachorro();
		c1.dormir();
		c1.raca = "Pastor Alem�o";
		c1.peso = 10;
	}

}
