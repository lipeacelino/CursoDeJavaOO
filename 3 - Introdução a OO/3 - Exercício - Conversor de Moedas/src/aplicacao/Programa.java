package aplicacao;

import util.ConversorDeMoedas;
import java.util.Scanner;

public class Programa {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println();
		System.out.println("Qual é o valor do dólar?");
		double valorDolar = scan.nextDouble();
		
		System.out.println("Quantos dólares você quer comprar?");
		double qtdDolar = scan.nextDouble();
		
		System.out.printf("Você pagará: R$ %.2f", ConversorDeMoedas.valorEmReais(valorDolar, qtdDolar));
		scan.close();
	}
}
