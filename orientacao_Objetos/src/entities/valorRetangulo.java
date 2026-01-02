
package entities;

public class valorRetangulo {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		width = Math.pow(width, 2);
		height = Math.pow(height, 2);
		return Math.sqrt(width + height);
	}
	
	public String toString() {
		return "Área = " 
			+ String.format("%.2f", area())
			+ "\nPerimetro = " 
			+ String.format("%.2f", perimeter()) 
			+ "\nDiagonal = "
			+ String.format("%.2f", diagonal());
	}
}