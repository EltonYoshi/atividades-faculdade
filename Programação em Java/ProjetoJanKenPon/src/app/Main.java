package app;

import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		byte escolha;
		System.out.println("PEDRA, PAPEL OU TESOURA");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		
		System.out.println("Digite sua escolha: ");
		escolha = sc.nextByte();
		byte computador = (byte)(Math.random()*3 + 1);
		
		JanKenPon j1 = new JanKenPon(escolha);
		JanKenPon c1 = new JanKenPon(computador);
		
		Jogo g1 = new Jogo(j1, c1);
		System.out.println(g1);
		
		
		System.out.println(g1.verificarVencedor());
	}
}
