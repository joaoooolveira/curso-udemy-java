package orientacao_Objetos;
import java.util.Scanner;
import java.util.Locale;

import entities.produtosEstoque;

public class Estoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		produtosEstoque product = new produtosEstoque();
		
		System.out.println("Digite os dados do produto:");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.printf("Dados do produto: " + product.toString());
		
		System.out.println();
		System.out.print("Adicione o número de produtos que serão colocados no estoque: ");
		int quantity = sc.nextInt();
		product.adicionarProduto(quantity);
		
		System.out.println();
		System.out.print("Dados atualizados: " + product.toString());
		
		System.out.println();
		System.out.print("Adicione o número de produtos que serão removidos do estoque: ");
		quantity = sc.nextInt();
		product.removerProduto(quantity);
		
		System.out.println();
		System.out.print("Dados atualizados: " + product.toString());
		
		sc.close();
	}

}