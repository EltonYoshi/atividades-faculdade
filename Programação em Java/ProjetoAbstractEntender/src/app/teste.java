package app;

public class teste {

	public static void main(String[] args) {
		//Animal � uma classe abstrata, logo n�o pode ser instanciada
		//Animal a1 = new Animal();
		Gato meuGato = new Gato();
		Cachorro meuCachorro = new Cachorro();
		
		//herdou o m�todo e o corpo (n�o abstrato)
		meuGato.dormir();
		meuCachorro.dormir();
		
		//herdou m�todo, mas n�o o corpo(abstrato)
		meuCachorro.fazerBarulho();
		meuGato.fazerBarulho();
		
		//herdou atributos
		//ta funcionando assim pq est� publico, do contr�rio teria q criar get e set
		meuCachorro.name = "Tot�";
		meuCachorro.age = 10;
		meuGato.name = "King";
		meuGato.age = 2;

	}

}
