package listas;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Funcionarios;

public class FuncionariosLista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		Funcionarios[] DadosFuncionarios = new Funcionarios[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) +": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			
			DadosFuncionarios[i] = new Funcionarios(id, name, salary);
		}
		
		for(Funcionarios funcionario : DadosFuncionarios) {
			list.add(funcionario);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		

		for(int i = 0; i < n; i++) {
			if(idSalary == DadosFuncionarios[i].getId()) {
				double salary = DadosFuncionarios[i].getSalary();
				
				double newSalary = salary * (1 + percentage / 100.0);
				
				DadosFuncionarios[i].setSalary(newSalary);
			}
		}
		System.out.println();
		
		System.out.println("List of employees:");
		for(Funcionarios funcionario : DadosFuncionarios) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}

}
