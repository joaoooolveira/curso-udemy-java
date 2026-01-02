package Exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int code1, code2, number1, number2;
		double price1, price2, quantity1, quantity2, total;
		
		System.out.printf("Type the code of the first piece of clothing: ");
		code1 = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("How many piece of clothing are you buying? ");
		number1 = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("How many cost this pieces? ");
		price1 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Type the code of the second piece of clothing: ");
		code2 = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("How many piece of clothing are you buying? ");
		number2 = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("How many cost this pieces? ");
		price2 = sc.nextDouble();
			
		quantity1 = number1 * price1;
		quantity2 = number2 * price2;
		total = quantity1 + quantity2;
		
		System.out.printf("%d = U$%.2f%n", code1, quantity1);
		System.out.printf("%d = U$%.2f%n", code2, quantity2);
		System.out.printf("Total to pay = U$%.2f%n", total);
		
		sc.close();
	}

}