package vetores;

import java.util.Locale;
import java.util.Scanner;

public class somaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		System.out.println("Valores:");
		for(int i = 0; i < n; i++) {
			System.out.print(vect[i] + " ");
			sum += vect[i];
			
		}
		System.out.println();
		
		System.out.printf("Soma: %.1f", sum);
		System.out.println();
		
		double avg = sum / n;
		
		System.out.printf("Média: %.1f", avg);
		
		sc.close();

	}

}
