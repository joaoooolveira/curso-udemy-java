package listas;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ExemploListas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<String> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos nomes deseja adicionar na lista? ");
		int n = sc.nextInt();
		
		String[] vect = new String[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o " + (i+1) + "º nome:");
			String nome = sc.next();
			vect[i] = nome;
		}
		
		for(int i = 0; i < n; i++) {
			list.add(vect[i]);
			list.remove(vect[1]);
			list.removeIf(x -> x.charAt(0) == 'M');
			
		}
		
		System.out.println(list);
		System.out.println("Index of João: " + list.indexOf("Joao"));
		
		sc.close();
	}

}
