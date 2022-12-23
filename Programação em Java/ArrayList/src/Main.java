
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main (String[]args){
        String[] friendsArray = new String[4];
        String[] friendArray2 = {"John", "Chris", "Eric", "Luke"};

        //Diferente de um array normal, o array list te permite criar arrays sem ter um número de definido para eles
        // Ou seja, o número de arrays aumenta conforme você coloca elementos dentro dele
        ArrayList<String> friendsArrayList = new ArrayList<>();

        friendsArrayList.add("Claudio");
        friendsArrayList.add("Elton");
        friendsArrayList.add("Jorge");


        System.out.println(friendsArrayList.get(0));
        //perceba que ele retornou o primeiro valor, que é Claudio

        friendsArrayList.set(0, "Andr�");
        System.out.println(friendsArrayList.get(0));
        //aqui ele transformou o array 0 (Claudio) em André

        System.out.println(friendsArrayList.size());
        //esse metodo mostra o tamanho do array, como o length

        friendsArrayList.remove(1);
        System.out.println(friendsArrayList);

        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
    }
}
