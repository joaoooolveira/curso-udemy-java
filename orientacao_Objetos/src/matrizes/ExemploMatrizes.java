package matrizes;

import java.util.Scanner;
import java.util.Locale;

public class ExemploMatrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de matrizes que deseja: ");
		int n = sc.nextInt();
		
		//Declaração de matrizes
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++) { //Entrada da matriz [i]
			for(int j = 0; j < n; j++) { //Entrada da matriz [j]
				System.out.print("Digite o [" + i + "][" + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " "); //Saída de coluna diagonal
		}
		
		int negativeNumbers = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					negativeNumbers++; //Números negativos na matriz total
				}
			}
		}
		
		System.out.println("Negative numbers = " + negativeNumbers);
		
		sc.close();
	}
}
