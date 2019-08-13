package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Produto prod = new Produto();
		
		System.out.println("Entre com os dados do produto: ");
		System.out.println("Nome: ");
		prod.nome = sc.nextLine();
		System.out.println("Preço: ");
		prod.preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		prod.quantidade = sc.nextInt();
		System.out.println();
		System.out.println("Dados do produto: " + prod);
		System.out.println();
		
		System.out.println("Entre com a quantidade de produtos que você quer adicionar no estoque: ");
		int qtd = sc.nextInt();
		prod.addProd(qtd);
		System.out.println();
		System.out.println("Dados atualizados: " + prod);
		System.out.println();
		
		System.out.println("Entre com a quantidade de produtos que você quer remover do estoque: ");
		qtd = sc.nextInt();
		prod.removeQtdProd(qtd);
		System.out.println("Dados atualizados: " + prod);
		
		sc.close();
	}

}
