package entities;

public class produtosEstoque {

	public String name;
	public double price;
	public int quantity;
	
	public double valorTotalEstoque() {
		return price * quantity;
	}

	
	
	public void adicionarProduto(int quantity) {
		this.quantity += quantity;
	}
	
	public void removerProduto(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $"
			+ String.format("%.2f", valorTotalEstoque());
	}

}