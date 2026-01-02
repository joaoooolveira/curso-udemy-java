package Processamento_de_Dados;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.println("Hello World!");
		
		System.out.printf("Resultado = %.2f", x);
	}

}