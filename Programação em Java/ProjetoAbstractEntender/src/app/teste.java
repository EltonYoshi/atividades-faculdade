package app;

public class teste {

	public static void main(String[] args) {
		//Animal é uma classe abstrata, logo não pode ser instanciada
		//Animal a1 = new Animal();
		Gato meuGato = new Gato();
		Cachorro meuCachorro = new Cachorro();
		
		//herdou o método e o corpo (não abstrato)
		meuGato.dormir();
		meuCachorro.dormir();
		
		//herdou método, mas não o corpo(abstrato)
		meuCachorro.fazerBarulho();
		meuGato.fazerBarulho();
		
		//herdou atributos
		//ta funcionando assim pq está publico, do contrário teria q criar get e set
		meuCachorro.name = "Totó";
		meuCachorro.age = 10;
		meuGato.name = "King";
		meuGato.age = 2;

	}

}
