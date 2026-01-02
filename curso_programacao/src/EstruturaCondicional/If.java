package EstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int horas;
		
		System.out.println("What hours are now?");
		horas = sc.nextInt();
		
		if (horas <= 10) {
			System.out.println("Good morning!");
		} else {
			System.out.println("Good afternoon!");
		}
		sc.close();
	}
}