package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorDeMoedas;

public class Programa {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto vale o dolar?");
		ConversorDeMoedas.setDolar(scan.nextDouble());
		scan.nextLine();
		
		System.out.println("Qual é o valor que deseja converter em R$?");
		ConversorDeMoedas.setQtdDolar(scan.nextDouble());
		scan.nextLine();
		
		System.out.printf("%.2f", ConversorDeMoedas.conversor());
		
		scan.close();
	}

}
