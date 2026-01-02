package construtores;
import java.util.Scanner;
import java.util.Locale;

import entities.construtoresEstoque;
 
public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Enter product data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
		construtoresEstoque product = new construtoresEstoque(name, price); //Construtores para a entrada de dados
		
		product.setName("Computer"); //setName para atualização do name
		System.out.println("Updated name: " + product.getName()); //getName para apresentar o valor atualizado do setName
		
		product.setPrice(1200); //setPrice para atualização do price
		System.out.println("Updated price: " + product.getPrice()); //getPrice para apresentar o valor atualizado do setPrice
		
		System.out.println();
		System.out.println("Product data: " + product); //Saída de dados com toString
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.adicionarProduto(quantity); //Construtor adicionarProduto para estoque
		
		System.out.println();
		System.out.println("Updated data: " + product); //Dados atualizados com toString
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removerProduto(quantity); //Construtor removerProduto de estoque
		
		System.out.println();
		System.out.println("Updated data" + product); //Saída de dados com toString
		
		sc.close();
	}
}
