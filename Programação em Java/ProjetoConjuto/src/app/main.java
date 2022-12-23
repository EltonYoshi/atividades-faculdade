package app;
import java.util.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


public class main {

	public static void main(String[] args) {
		 	File arquivo = new File("C:\\trabalho.txt");
	        Scanner in = new Scanner(System.in);
            ArrayList<String> linhas = new ArrayList<>();
            ArrayList<String[]> principal = new ArrayList<>();
            
            ArrayList<String> uniao = new ArrayList<>();
            ArrayList<String> inter = new ArrayList<>();
            ArrayList<String> diferenca = new ArrayList<>();
            ArrayList<String> cartesiano = new ArrayList<>();
	        try{
	            in = new Scanner(arquivo);
	            while(in.hasNextLine()){
	                String linhaArquivo = new String();
	                linhaArquivo = in.nextLine();
	                linhas.add(linhaArquivo.toString());

	                

	            }

	        } catch(Exception error) {

	        }
            for(int i = 0; i < linhas.size();i++) {
            	principal.add(linhas.get(i).split(", "));
            }
            
            
            for(int i= 0; i < 4; i++) {
                uniao.add(principal.get(2)[i]);
                uniao.add(principal.get(3)[i]);
   
            }
            for(int i = 0; i < principal.get(2).length; i++) {
            	for(int j = 0; j < principal.get(3).length; j++) {
            		if(principal.get(2)[i].equals(principal.get(3)[j])) {
            			uniao.remove(principal.get(2)[i]);
            		}
            	}
            }
            
            
            
            System.out.println(uniao);
            for(int i = 0; i < principal.get(5).length; i++) {
            	for(int j = 0; j < principal.get(6).length; j++) {
            		if(principal.get(5)[i].equals(principal.get(6)[j])) {
            			inter.add(principal.get(5)[i]);
            		}
            	}
            }
            
            for(int i= 0; i < 4; i++) {
                diferenca.add(principal.get(8)[i]);
                diferenca.add(principal.get(9)[i]);
   
            }

            for(int i = 0; i < principal.get(8).length; i++) {
            	for(int j = 0; j < principal.get(9).length; j++) {
            		if(principal.get(8)[i] != principal.get(9)[j] ) {
            			diferenca.remove(principal.get(9)[j]);
            		}
            	}
            }
            
            for(int i = 0; i < principal.get(11).length; i++) {
            	for(int j = 0; j < principal.get(12).length; j++) {
            		
            		cartesiano.add(principal.get(11)[i] +"."+ principal.get(12)[j]);
         
            	}
            }
            System.out.println(cartesiano);
            System.out.println(diferenca);
            System.out.println(inter);
	        
	        
	        
	        
	   }

}

