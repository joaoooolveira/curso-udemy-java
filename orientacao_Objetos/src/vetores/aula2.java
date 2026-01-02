package vetores;

import java.util.Locale;
import java.util.Scanner;
import entities.aula2Class;

public class aula2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		aula2Class[] vect = new aula2Class[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			double valorProduto = sc.nextDouble();
			vect[i] = new aula2Class(nomeProduto, valorProduto);
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			sum += vect[i].getValor();
		}
		
		double avg = sum / n;
		
		System.out.println();
		
		System.out.printf("Average values %.2f%n", avg);
		
		sc.close();

	}

}
