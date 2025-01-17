package aplicacao;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		List<Produto> produtos = new ArrayList<Produto>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de produtos: ");
		double qtd = scan.nextDouble();
		scan.nextLine();
		
		for (int i=1; i<=qtd; i++) {
			
			System.out.println("Digite os dados do produto #" + i);
			System.out.println("Comum, usado ou importado? (c/u/i)");
			String tipoProd = scan.nextLine().toLowerCase();
			
			switch (tipoProd) {
				case "i":
					System.out.println("Nome: ");
					String nomeI = scan.nextLine();
					
					System.out.println("Preço: ");
					double precoI = scan.nextDouble();
					System.out.println("Taxa: ");
					double taxaI = scan.nextDouble();
					scan.nextLine();
					produtos.add(new ProdutoImportado(nomeI, precoI, taxaI));
					break;
					
				case "c":
					System.out.println("Nome: ");
					String nomeC = scan.nextLine();
					
					System.out.println("Preço: ");
					double precoC = scan.nextDouble();
					scan.nextLine();
					produtos.add(new Produto(nomeC, precoC));
					break;
					
				case "u":
					System.out.println("Nome: ");
					String nomeU = scan.nextLine();
					
					System.out.println("Preço: ");
					double precoU = scan.nextDouble();
					scan.nextLine();
					System.out.println("Data de fabricação (DD/MM/AAAA): ");
					Date dataU = ProdutoUsado.sdf.parse(scan.nextLine());
					produtos.add(new ProdutoUsado(nomeU, precoU, dataU));
					break;
			
			}
			
		}
		System.out.println("Etiqueta de preço:");
		for (Produto p : produtos) {
			System.out.println(p.etiquetaDePreco());
		}
		
		scan.close();

	}

}
