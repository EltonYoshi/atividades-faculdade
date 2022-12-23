package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		listaDeCompras l1 = new listaDeCompras();
		int op;
		int escolha1;
		
		do {
		
			System.out.println("Digite");
			System.out.println("1 - Cadastrar Produtos");
			System.out.println("2 - Vizualizar Produtos");
			System.out.println("3 - Ver quantidade de Produtos");
			System.out.println("4 - Apagar todos os Produtos");
			System.out.println("5 - Ver total de compras");
			System.out.println("0 - Sair");
			System.out.println("Escolha: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				do {
					Produto p1 = new Produto();
					System.out.println("Digite o nome do produto: ");
					p1.setNome(sc.next());	
					
					System.out.println("Digite a quantidade do produto: ");
					p1.setQuantidade(sc.nextInt());
					
					System.out.println("Digite o valor do produto: ");
					p1.setValorUnitario(sc.nextDouble());
					
					System.out.println("Digite 1 para continuar e 0 para parar:  ");
					escolha1 = sc.nextInt();
					
					l1.adicionarProduto(p1);

				}while (escolha1 > 0);
				break;
			case 2:
				if (l1.getLista().isEmpty()) {
					System.out.println("Não há produtos cadastrados.");
				}else {
					System.out.println(l1);
				}
				break;
			case 3:
				System.out.println("Você possui "+ l1.obterQuantidadeDeProdutos()+" produtos");
				break;
			case 4:
				if (l1.getLista().isEmpty()) {
					System.out.println("Não há produtos para excluir");
				}else {
					int confirma;
					System.out.println("Tem certeza que você quer excluir TUDO?\n1-SIM\n2-NÃO");
					confirma = sc.nextInt();
					if(confirma == 1) {
						System.out.println("Seus produtos foram apagados com sucesso!");
						l1.apagarTudo();
					}else {
						System.out.println("Opção cancelada!");
					}
					
				}

				break;
			case 5:
				System.out.println("Sua compra custará R$ "+ l1.calcularTotalDaLista());
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Opção invalida.");
			}


		}while(op != 0);
		
		
	}

}
