package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int funcionario;
		double horas, salario, resultado;
		
		System.out.println("What's your code?");
		funcionario = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Alright, so, how many do you receive per hour in your work?");
		salario = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("And how many hours do you have worked this month?");
		horas = sc.nextDouble();
		
		System.out.println();
		
		resultado = salario * horas;
		System.out.println("Number = " + funcionario);
		System.out.println("Salary = U$" + resultado);
		
		sc.close();
	}

}