package app;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Date c = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("HH:mm");
		Calendar i = Calendar.getInstance();
		
		System.out.println(i.getTime());
		System.out.println("Digite as horas: ");
		Date h = formatar.parse(sc.next());
		
		
		System.out.println(h.getHours() + ":" + h.getMinutes());
		
		if(h.getHours() == i.get(Calendar.HOUR) && h.getMinutes() == i.get(Calendar.MINUTE)) {
			System.out.println("Agora");
		}
	}

}
