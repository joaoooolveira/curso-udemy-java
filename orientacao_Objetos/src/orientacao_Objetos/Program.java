package orientacao_Objetos;
import java.util.Scanner;

import entities.triangulo;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		triangulo x, y;
		x = new triangulo();
		y = new triangulo();
		
		System.out.println("Coloque os valores do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Coloque os valores do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();		
		double areaY = y.area();
		
		System.out.printf("Triângulo X área: %.4f%n", areaX);
		
		System.out.printf("Triângulo Y área: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		} else {
			System.out.println("Maior área: Y");
		}
		
		sc.close();
	}

}
