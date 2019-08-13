package entidades;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
	
	private Date momentoDoPedido;
	private StatusPedido status;
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();
	private Cliente cliente;
	
	public Pedido(Date dataDoPedido, StatusPedido status, Cliente cliente) {
		this.momentoDoPedido = dataDoPedido;
		this.status = status;
		this.cliente = cliente;
	}

	public void addItem(ItemPedido item) {
		this.itens.add(item);
	}

	public void removeItem(ItemPedido item) {
		this.itens.remove(item);
	}
	
	public double total() {
		double total = 0;
		for (ItemPedido i : itens) {
			total += i.subTotal();
		}
		return total;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("DADOS DO PEDIDO: \n" );
		sb.append("Data pedido: " + sdf.format(momentoDoPedido) + "\n");
		sb.append("Status: " + getStatus() + "\n");
		sb.append("Cliente: " + getCliente().getNome() + " Email: " + getCliente().getEmail() + "\n");
		sb.append("Total: " + total() + "\n");
		for(ItemPedido i : itens) {
			sb.append((i));
		}
		return sb.toString();	
	}
	
	public Date getMomentoDoPedido() {
		return momentoDoPedido;
	}

	public void setMomentoDoPedido(Date dataDoPedido) {
		this.momentoDoPedido = dataDoPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
