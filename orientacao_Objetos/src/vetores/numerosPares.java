package vetores;

import java.util.Locale;
import java.util.Scanner;

public class numerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Número " + (i+1) + ": ");
			vect[i] = sc.nextInt();
		}
		
		int numPares = 0;
		
		System.out.println("Números pares: ");
		for(int i = 0; i < n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
				numPares++;
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de números pares: " + numPares);
		
		sc.close();

	}

}
