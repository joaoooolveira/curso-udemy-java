package vetores;

import java.util.Locale;
import java.util.Scanner;
import entitiesVetores.dadosPessoasClass;

public class dadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		
		dadosPessoasClass[] vect = new dadosPessoasClass[n];
		
		int genFem = 0, genMas = 0;
		double sumFem = 0.0, menorAltura = 0, maiorAltura = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "ª pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "ª pessoa(M/F): ");
			char genero = sc.next().charAt(0);
			if(genero == 'f' || genero == 'F') {
				sumFem += altura;
				genFem++;
			} else if(genero == 'm' || genero == 'M') {
				genMas++;
			} else {
				System.out.println("Digite apenas M/F.");
			}
			
			vect[i] = new dadosPessoasClass(altura, genero);
			System.out.println();
		}
		
		menorAltura = vect[0].getAltura();
		maiorAltura = vect[0].getAltura();
		
		for(int i = 0; i < n; i++) {
			if(vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
			} else if(vect[i].getAltura() > maiorAltura) {
				maiorAltura = vect[i].getAltura();
			}
		}
		
		double avgFem = sumFem / genFem;
		
		System.out.printf("Menor altura: %.2f", menorAltura);
		System.out.println();
		System.out.printf("Maior altura: %.2f", maiorAltura);
		System.out.println();
		System.out.printf("Média das alturas das mulheres: %.2f", avgFem);
		System.out.println();
		System.out.println("Número de homens: " + genMas);
		
		sc.close();

	}

}
