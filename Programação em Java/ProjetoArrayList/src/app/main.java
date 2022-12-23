package app;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int op = 0;
		Scanner sc = new Scanner(System.in);
		listaDeCompra l1 = new listaDeCompra();
		do {
			System.out.println("DIGITE: ");
			System.out.println("1 - Cadastrar Produto ");
			System.out.println("2 - Listar Produtos");
			System.out.println("DIGITE: ");
			System.out.println("DIGITE: ");
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				produto p1 = new produto();
				System.out.println("Digite o nome do produto: ");
				p1.setNome(sc.nextLine());
				
				//verificar a quantidade que o usuário escrever
				
				do {
					System.out.println("Digite a quantidade: ");
					p1.setQuantidade(sc.nextInt());
					
					if(p1.getQuantidade() <= 0) {
						System.out.printf("ERRO, quantidade inválida!");
						System.out.printf("VOCÊ É UM SACO DE MERDA, PQ TU QUER %i BGLS", p1.getQuantidade());
					}
				}while(p1.getQuantidade() <= 0);
				
				//verificar o valor unitário que o usuário escrever
				do {
					System.out.println("Digite o preço: ");
					p1.setValorUnitario(sc.nextDouble());
					
					if(p1.getValorUnitario() <= 0) {
						System.out.printf("ERRO, quantidade inválida!");
						System.out.printf("VOCÊ É UM SACO DE MERDA, PQ TU QUER PAGAR %lf NO BGL", p1.getValorUnitario());
					}
				}while(p1.getValorUnitario() <= 0);
				l1.adicionarProduto(p1);
				break;
			case 2:
				if(l1.getLista().isEmpty()) {
					System.out.println("Não há produtos!");
					
				}else {
					System.out.println(l1);
				}
				break;
			case 3:
				System.out.println("Total de cadastros: " + l1.obterQuantidadeDeProduto());
				break;
			case 4:
				if(l1.getLista().isEmpty()) {
					System.out.println("Não há produtos para excluir:");
				}else {
					int confirma;
					System.out.println("Tem certeza que deseja excluir? \n1- SIM\n2-NÃO");
					confirma = sc.nextInt();	
					if(confirma == 1) {
						System.out.println("Produtos excluidos com sucesso!");
						l1.limparLista();
					}else {
						System.out.println("Opção cancelada!");
					}
					
				}
				break;
			case 5:
				System.out.println("Total de lista R$: "+ l1.calcularTotalDaLista());
				break;
			case 0:
				System.out.println("Sistema encerrado");
			}
			
				
				
		}while(op != 0);


			
	}

}
