package vetores;

import java.util.Locale;
import java.util.Scanner;
import entitiesVetores.alturasClass;

public class alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		alturasClass[] vect = new alturasClass[n];
		
		double sum = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da "+ (i+1) +"ª pessoa:");
			System.out.println();
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new alturasClass(nome, idade, altura);
			System.out.println();
			
		}
		
		for(int i = 0; i < n; i++) {
			sum += vect[i].getAltura();
		}
		
		double menor = 0;
		
		for(int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				menor++;
			}
		}
		
		double resultadoMenor = menor / n;
		double avg = sum / n;
		double percent = resultadoMenor * 100;
		
		System.out.printf("Altura média: %.2f", avg);
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%", percent);
		System.out.println();
		for(int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}

		sc.close();
	}

}
