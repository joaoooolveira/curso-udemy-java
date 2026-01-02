package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int x, y, resultado;
		
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite o primeiro valor: ");
		x = sc.nextInt();

		System.out.printf("Digite o segundo valor: ");
		y = sc.nextInt();
		
		resultado = x + y;
		System.out.println(x + " + " + y + " = " + resultado);
		
		sc.close();
	}
}