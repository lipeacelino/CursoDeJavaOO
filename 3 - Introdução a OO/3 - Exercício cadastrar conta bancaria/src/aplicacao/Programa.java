package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta c1;
		
		System.out.println("Entre com o número da conta: ");
		int numero = sc.nextInt();
		System.out.println("Entre com o nome do titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Deseja fazer um depósito inicial? ");
		char opcao = sc.next().charAt(0);
		if (opcao == 'y') {
			System.out.println("Digite o valor do depósito");
			double valor = sc.nextDouble();
			c1 = new Conta(titular, numero, valor);
		}
		else {
			c1 = new Conta(titular, numero);
		}
		System.out.println("Dados da conta: ");
		System.out.println(c1.toString());
		System.out.println();
		
		System.out.println("Digite o valor do depósito: ");
		double valor = sc.nextDouble(); 
		c1.realizarDeposito(valor);
		System.out.println("Dados da conta: ");
		System.out.println(c1.toString());
		System.out.println();
		
		System.out.println("Digite o valor do saque: ");
		valor = sc.nextDouble();
		c1.realizarSaque(valor);
		System.out.println("Dados da conta: ");
		System.out.println(c1.toString());
		System.out.println();
		
		sc.close();
	}

}
