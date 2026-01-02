package vetores;

import java.util.Locale;
import java.util.Scanner;

public class mediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos terá no vetor: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double somaPares = 0.0;
		int numPares = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Número " + (i+1) + ": ");
			vect[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < n; i++) {
			if(vect[i] % 2 == 0) {
				somaPares += vect[i];
				numPares++;
			}
		}
		
		double avg = somaPares / numPares;
		if(numPares == 0) {
			System.out.println("Não tem números pares.");
		} else {
			System.out.println("Média dos números pares: " + avg);
		}
		
	sc.close();
	}

}
