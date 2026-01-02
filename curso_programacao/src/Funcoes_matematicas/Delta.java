package Funcoes_matematicas;
import java.util.Locale;

public class Delta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double delta, x1, x2;
		//Valores criados somente para exemplo
		double a = 2.0;
		double b = 3.0;
		double c = 4.0;
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		System.out.println(x1);
		
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		System.out.println(x2);
	}

}