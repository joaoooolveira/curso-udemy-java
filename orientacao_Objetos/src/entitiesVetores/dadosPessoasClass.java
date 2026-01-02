package entitiesVetores;

public class dadosPessoasClass {
	
	private double altura;
	private char genero;
	
	public dadosPessoasClass() {
	}
	
	public dadosPessoasClass(double altura, char genero) {
		this.altura = altura;
		this.genero = genero;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public void setGenero(char genero) {
		this.genero = genero;
	}

}
