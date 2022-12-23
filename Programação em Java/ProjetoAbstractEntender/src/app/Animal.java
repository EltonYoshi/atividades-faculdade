package app;
/*
 * Imagine que você queira criar questinário perguntando se uma pessoa tem um gato ou um cachorro,
 * ambos são animais, porém cada um faz parte de uma classe diferente, porém possuem atributos e métodos em comum,
 * Resumindo, para que você não tenha que reescrever esses métodos em comum, é criado uma classe PAI, que vai
 * englobar esses atributos em comum para que as classes cachorro e gato herdem.
 * 
 * Contudo, essa classe PAI não precisa meio que existir para criar um objeto animal, porque você quer
 * criar um objeto cachorro ou gato, então se cria um classe PAI abstrata que só vai servir para 
 * justamento para ser herdada de outras subclasses e não instanciada.
 * 
 * */
public abstract class Animal {
	 int age;
	 String name;
	
	/* 
	 * Esse é um método abstrado que tu cria com o propósito de emplementá-la em todas as subclasses
	 * que herdarão a classe ANIMAL, contudo um gato faz miau e um cachorro faz auau, então na as classes
	 * cachorro e gato possuem um método em comum, mas com confecções diferentes. Por isso é criado um método
	 * abstrado.
	 * */
	public abstract void fazerBarulho();
	
	/* 
	 * Nesse caso, ambos os animais dormem, mas não fazem algo específico quando dormem, então
	 * todos podem herdar e faze "zzzzz" quando dormirem
	 * */
	public void dormir() {
		System.out.println("zzzzzzz");
	}
	
	
}
