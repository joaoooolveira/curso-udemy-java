package entities;

public class aula2Class {
	
	//Declarando as variáveis
	private String produto;
	private double valor;
	
	public aula2Class() {
	}
	
	//Declarando construtor de produto e valor
	public aula2Class(String produto, double valor) {
		this.produto = produto;
		this.valor = valor;
	}
	
	//get de produto
	public String getProduto() {
		return produto;
	}

	//set de produto
	public void setProduto(String produto) {
		this.produto = produto;
	}

	//get de valor
	public double getValor() {
		return valor;
	}

	//set de valor
	public void setValor(double valor) {
		this.valor = valor;
	}

}
