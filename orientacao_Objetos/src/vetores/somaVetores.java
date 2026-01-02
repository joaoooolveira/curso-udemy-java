package vetores;

import java.util.Locale;
import java.util.Scanner;

public class somaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores terá cada vetor: ");
		int n = sc.nextInt();

		double[] vectA = new double[n];
		double[] vectB = new double[n];
		
		System.out.println("Valores do vetor A:");
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + ": ");
			vectA[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("Valores do vetor B:");
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + ": ");
			vectB[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("Valores resultantes: ");
		
		double[] vectTotal = new double[n];
		
		for(int i = 0; i < n; i++) {
			vectTotal[i] = vectA[i] + vectB[i];
			System.out.println((i+1) + ": " + vectTotal[i]);
		}
		
		sc.close();
	}

}
