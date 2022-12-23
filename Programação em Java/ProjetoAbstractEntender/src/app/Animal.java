package app;
/*
 * Imagine que voc� queira criar questin�rio perguntando se uma pessoa tem um gato ou um cachorro,
 * ambos s�o animais, por�m cada um faz parte de uma classe diferente, por�m possuem atributos e m�todos em comum,
 * Resumindo, para que voc� n�o tenha que reescrever esses m�todos em comum, � criado uma classe PAI, que vai
 * englobar esses atributos em comum para que as classes cachorro e gato herdem.
 * 
 * Contudo, essa classe PAI n�o precisa meio que existir para criar um objeto animal, porque voc� quer
 * criar um objeto cachorro ou gato, ent�o se cria um classe PAI abstrata que s� vai servir para 
 * justamento para ser herdada de outras subclasses e n�o instanciada.
 * 
 * */
public abstract class Animal {
	 int age;
	 String name;
	
	/* 
	 * Esse � um m�todo abstrado que tu cria com o prop�sito de emplement�-la em todas as subclasses
	 * que herdar�o a classe ANIMAL, contudo um gato faz miau e um cachorro faz auau, ent�o na as classes
	 * cachorro e gato possuem um m�todo em comum, mas com confec��es diferentes. Por isso � criado um m�todo
	 * abstrado.
	 * */
	public abstract void fazerBarulho();
	
	/* 
	 * Nesse caso, ambos os animais dormem, mas n�o fazem algo espec�fico quando dormem, ent�o
	 * todos podem herdar e faze "zzzzz" quando dormirem
	 * */
	public void dormir() {
		System.out.println("zzzzzzz");
	}
	
	
}
