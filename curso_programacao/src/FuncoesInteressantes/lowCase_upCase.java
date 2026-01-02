package FuncoesInteressantes;
import java.util.Locale;
public class lowCase_upCase {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String original = "ABCde FGhiJ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 7);
		String s06 = original.replace('A', 'i');
		int i = original.indexOf("ABC");
		int j = original.lastIndexOf("hi");
		
		System.out.println("Original: " + original);
		System.out.println("toLower: " + s01);
		System.out.println("toUp: " + s02);
		System.out.println("trim: " + s03 + "-");
		System.out.println("substring: " + s04);
		System.out.println("substring(inicio, fim): " + s05);
		System.out.println("replace: " + s06);
		System.out.println(i);
		System.out.println(j);
	}

}