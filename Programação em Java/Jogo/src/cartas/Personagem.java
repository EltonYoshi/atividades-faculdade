package cartas;

public abstract class Personagem {
	String nome;
	int vida;
	int velocidadeDeAtaque;
	int potenciaDeAtque;
	int defeza;
	int posi��oLinha;
	int posi��oColuna;
	
	public int defender(int forcaAtaque) {
		int dano = forcaAtaque - defeza;
		if (dano < 0) {
			dano = 0;
		}
		this.vida = this.vida - dano;
		return this.vida;
	}
}
