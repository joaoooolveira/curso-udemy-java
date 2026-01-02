
package EstruturaCondicional;
import java.util.Locale;

public class ExpressaoTernaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		double resultado = preco - desconto;
		
		System.out.printf("Desconto aplicado: R$%.2f%n", desconto);
		System.out.printf("Total a pagar: R$%.2f", resultado);

	}

}