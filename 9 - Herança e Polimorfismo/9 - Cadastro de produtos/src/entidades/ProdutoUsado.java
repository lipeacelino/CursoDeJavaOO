package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	private Date dataDeFabricacao;
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, double preco, Date dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}

	@Override
	public String etiquetaDePreco() {
		return this.getNome() + " (usado) R$ " + String.format("%.2f", this.getPreco()) 
				+ "(Data de fabricação: " + sdf.format(dataDeFabricacao) + ")"; //converte a data pra string
	}

}
