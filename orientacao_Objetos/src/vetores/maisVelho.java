package vetores;

import java.util.Locale;
import java.util.Scanner;
import entitiesVetores.maisVelhoClass;

public class maisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar: ");
		int n = sc.nextInt();
		
		maisVelhoClass[] vect = new maisVelhoClass[n];
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i+1) + "ª pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new maisVelhoClass(nome, idade);
		}
		
		int pos_maisVelho = 0;
		
		for(int i = 0; i < n; i++) {
			if(vect[i].getIdade() > vect[pos_maisVelho].getIdade()) {
				pos_maisVelho = i;
			}
			
		}
		
		System.out.println();
		System.out.println(vect[pos_maisVelho]);
		
		sc.close();
	}

}
