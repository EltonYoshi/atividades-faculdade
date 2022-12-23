
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        Set set1 = new Set();
        byte escolha;

        // Definição dos times
        Time t1 = new Time();
        System.out.println("***** TIME 1 *****");

        System.out.println("Nome do time 1: ");
        t1.setNome(sc.next());

        System.out.println("Técnico do time 1: ");
        t1.setTecnico(sc.next());

        Time t2 = new Time();
        System.out.println("***** TIME 2 *****");

        System.out.println("Nome do time 2: ");
        t2.setNome(sc.next());

        System.out.println("Técnico do time 2: ");
        t2.setTecnico(sc.next());

        set1.setTime1(t1);
        set1.setTime2(t2);

        do {
            System.out.println(set1 + "\n");
            System.out.println("1 - Mercar ponto para: ", t1.getNome());
            System.out.println("1 - Mercar ponto para: ", t2.getNome());
            escolha = sc.nextByte();
            switch (escolha){
                case 1:
                    t1.pontuar();
                    System.out.println("Ponto para " + t1.getNome());
                    break;
                case 2:
                    t2.pontuar();
                    System.out.println("Ponto para "+ t2.getNome());
                    break;
            }
        }while(set1.continuarSet());

        System.out.println("\nPartida encerrada");
        System.out.println(set1);
        System.out.println("VENCEDOR: " + set1.obterVencedor());
    }
}
