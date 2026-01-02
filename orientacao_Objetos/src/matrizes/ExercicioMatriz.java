package matrizes;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de colunas que deseja: ");
		int n = sc.nextInt();
		
		System.out.print("Digite o número de linhas que deseja: ");
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print
		("Digite o número que deseja procurar: ");
		int numberSearchForDesc = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(mat[i][j] == numberSearchForDesc) {
					System.out.println("Position [" + i + "][" + j + "]: ");
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
					
				}
			}
		}
		
		sc.close();
	}

}
