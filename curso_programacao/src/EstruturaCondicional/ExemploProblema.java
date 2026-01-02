package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;
public class ExemploProblema {

	public static void main(String[] args) {
		//Uma operadora de telefonia cobra R$50 por um plano basico que da direito a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos custa R$2.
		//Fazer um programa pra ler a quantidade de minutos que uma pessoa consumiu, dai mostrar o valor a ser pago.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double custo = 50.0;
		
		System.out.println("How many minutes are used?");
		minutos = sc.nextInt();
		
		if(minutos > 100) {
			custo += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Minutos: %d%n", minutos);
		System.out.printf("Total a pagar: %.2f", custo);
		
		sc.close();
	}
}