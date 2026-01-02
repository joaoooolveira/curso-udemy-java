package vetores;

import java.util.Locale;
import java.util.Scanner;
import entitiesVetores.aprovadosClass;
public class aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		
		aprovadosClass[] vect = new aprovadosClass[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) + "º aluno:");
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			vect[i] = new aprovadosClass(nome, nota1, nota2);
			
			System.out.println();
		}
		
		double[] avgNotas = new double[n];
		
		for(int i = 0; i < n; i++) {
			avgNotas[i] = (vect[i].getNota1() + vect[i].getNota2()) / 2;
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i < n; i++) {
			if(avgNotas[i] >= 6.0) {
				System.out.println(vect[i].toString());
			}
		}
		
		sc.close();
	}

}
