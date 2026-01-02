package vetores;

import java.util.Locale;
import java.util.Scanner;

public class maiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar: ");
		int n = sc.nextInt();
		
		int sequencia;
		double maiorNumero;
		
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Número " + (i+1) + ": ");
			vect[i] = sc.nextDouble();
		}
		
		maiorNumero = vect[0];
		sequencia = 0;
		
		for(int i = 1; i < n; i++) {
			if(vect[i] > maiorNumero) {
				maiorNumero = vect[i];
				sequencia = i;
			}
		}
		
		System.out.printf("Maior número: %.1f", maiorNumero);
		System.out.println();
		System.out.println("Posição do maior valor: " + sequencia);

		sc.close();
	}

}
