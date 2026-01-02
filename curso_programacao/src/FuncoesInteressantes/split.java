package FuncoesInteressantes;
import java.util.Locale;

public class split {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[0]);

	}

}