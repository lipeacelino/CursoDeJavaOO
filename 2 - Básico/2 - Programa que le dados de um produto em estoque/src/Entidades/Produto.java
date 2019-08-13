package Entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double totalValorEmEstoque() {
		return preco * quantidade;
	}
	
	public void addProd(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeQtdProd(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return	this.nome + ", "
				+ "R$ " + String.format("%.2f", this.preco) + ", " 
				+ "Quantidade: " + this.quantidade + " "
				+ "Total: R$ " + String.format("%.2f", totalValorEmEstoque());
	}
}
