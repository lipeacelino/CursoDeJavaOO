package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.StatusPedido;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.println("- Digite os dados do cliente -");
		System.out.println("Digite o nome do cliente: ");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Digite o email do cliente: ");
		String email = sc.nextLine();
		
		System.out.println("Digite a data de nascimento do cliente: ");
		Date dataNasc = sdf.parse(sc.next());
		sc.nextLine(); //consome a quebra de linha
		Cliente cliente = new Cliente(nomeCliente, email, dataNasc);
		
		System.out.println("- Digite o status do pedido -");
		System.out.println("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.nextLine());
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.println("Quantos pedidos você deseja fazer? ");
		int qtdPedidos = sc.nextInt();
		sc.nextLine(); //consome a quebra de linha
		
		
		for (int i=0; i < qtdPedidos; i++) {
			System.out.println("- Digite os dados do pedido #" + (i+1) + " -");
			System.out.println("Nome: ");
			String nomeDoProduto = sc.nextLine();
			System.out.println("Preco:");
			double preco = sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
			pedido.addItem(new ItemPedido(new Produto(nomeDoProduto, preco),quantidade, preco)); //forma simplificada
			sc.nextLine(); //consome a quebra de linha
		}
		
		System.out.println("Resumo do pedido");
		System.out.println(pedido);
	
		sc.close();
	}

}
