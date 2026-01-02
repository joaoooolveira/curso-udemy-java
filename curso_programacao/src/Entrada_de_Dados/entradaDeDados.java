package Entrada_de_Dados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner nome = new Scanner(System.in);
		Scanner idade = new Scanner(System.in);
		Scanner salario = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = nome.next();		
		System.out.printf("Your name is: %s%n",x);
		
		y = idade.nextInt();
		System.out.printf("You're %d years old%n",y);
		
		z = salario.nextDouble();
		System.out.printf("And you receive %.2f per month%n",z);
		
		nome.close();
		idade.close();
		salario.close();
	}

}
