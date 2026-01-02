package construtores;

import java.util.Locale;
import java.util.Scanner;

import entities.exampleConstrutores;

public class exampleExercises {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		exampleConstrutores account;

		//Entrada de dados
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new exampleConstrutores(number, holder, initialDeposit); //Construtores com depósito inicial
		}
		else {
			account = new exampleConstrutores(number, holder); //Construtores sem depósito inicial
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account); //Saída de dados com toString
		
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble(); //Construtores depositValue para a entrada de depósitos
		account.deposit(depositValue);
		
		System.out.println("Updated account data:");
		System.out.println(account); //Saída de dados
		
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble(); //Construtores withdrawValue para saque
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}
}