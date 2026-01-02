package Exercicios;
import java.util.Locale;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		double area, pi, raio;
		
		pi = 3.14159;
		
		System.out.printf("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		raio = Math.pow(raio, 2.0);
		
		area = pi * raio;
		
		System.out.println("A area de " + raio + " = " + area);
		
		sc.close();
	}

}