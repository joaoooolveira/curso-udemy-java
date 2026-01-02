package EstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class EncadeamentoDeIF {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		System.out.println("What hours are now?");
		horas = sc.nextInt();
		
		if(horas <= 10) {
			System.out.println("Good Morning!");
		} else {
			if(horas <= 18) {
				System.out.println("Good Afternoon!");
			} else {
				System.out.println("Good night");
			}
		}
		sc.close();
	}

}
