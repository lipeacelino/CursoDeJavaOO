package entidades;
public class ItemPedido {
	
	private Produto produto;
	private	int quantidade; 
	private double preco;
	
	public ItemPedido(Produto produto, int quantidade,  double preco) {
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ITEM: ");
		sb.append(produto.getNome() + ", " + produto.getPreco() + ", ");
		sb.append("Quantidade: " + getQuantidade() + ", Subtotal: " + subTotal()+"\n");
		return sb.toString();
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double subTotal() {
		return preco * quantidade;
	}
	
}
