package entidades;

public class ProdutoImportado extends Produto{
	
	private double taxa;
	
	public ProdutoImportado() {
		super();
	}
	
	public ProdutoImportado(String nome, double preco, double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double precoTotal() {
		return taxa + this.getPreco();
	}
	
	@Override
	public String etiquetaDePreco() {
		return this.getNome() + " R$ " + String.format("%.2f", precoTotal()) 
		+ " Taxa: (R$ " + String.format("%.2f", this.getTaxa()) + ")"; 
	}
}
