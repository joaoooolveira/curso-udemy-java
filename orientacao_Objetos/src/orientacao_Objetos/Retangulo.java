package orientacao_Objetos;

import java.util.Locale;
import java.util.Scanner;

import entities.valorRetangulo;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		valorRetangulo product = new valorRetangulo();
		
		System.out.println("Digite a área e altura do Retangulo: ");
		product.width = sc.nextDouble();
		product.height = sc.nextDouble();
		
		System.out.println();
		System.out.print(product);
		
		sc.close();
	}

}