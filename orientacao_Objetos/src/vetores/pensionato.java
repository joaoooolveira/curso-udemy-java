package vetores;

import java.util.Locale;
import java.util.Scanner;
import entitiesVetores.pensionatoClass;

public class pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		pensionatoClass[] vect = new pensionatoClass[10];
		
		for(int i = 1; i < n; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Rent #" + i +": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.printf("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new pensionatoClass(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}
}
