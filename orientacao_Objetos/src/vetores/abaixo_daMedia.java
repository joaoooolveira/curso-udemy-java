package vetores;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_daMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos terá no vetor: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double sum = 0.0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Número " + (i+1) + ": ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		System.out.println();
		double avg = sum / n;
		
		System.out.println("Média do vetor: " + avg);
		System.out.println();
		System.out.println("Números abaixo da média: ");
		for(int i = 0; i < n; i++) {
			if(vect[i] < avg) {
				System.out.print(vect[i] + " ");
			}
		}
		
		sc.close();
	}

}
