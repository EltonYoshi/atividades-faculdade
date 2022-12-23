import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //int [] pares = new int [6];
        int [] pares = {0, 2, 4, 6, 8};

        System.out.println("Numeros Pares: ");
        /*for(int i = 0; i < 6; i++){
            System.out.println(pares[i]);
        }*/
        //ele imprime array no formato de string
        System.out.println(Arrays.toString(pares));

        //ele conta o número de arrays
        System.out.println("O array contém " + pares.length + " elementos");
    }
}
