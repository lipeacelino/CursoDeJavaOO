package aplicacao;

import java.util.Scanner;

import entidades.Aluguel;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluguel[] aluguel = new Aluguel[10];
		
		System.out.println("Quantos quartos deseja alugar? ");
		int qtd = scan.nextInt();
		System.out.println();
		
		for (int i=0; i<qtd; i++) {
			System.out.println("Aluguel #"+(i+1));
			System.out.println("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.println("Email: ");
			String email = scan.nextLine();
			System.out.println("Quarto: ");
			int quarto = scan.nextInt();
			System.out.println();
			Aluguel inquilino = new Aluguel(nome, email, quarto);
			aluguel[quarto] = inquilino;
		}
		
		System.out.println("Quartos alugados: ");
		for (int i=0; i<aluguel.length; i++) {
			if (aluguel[i] != null) {
				System.out.println(aluguel[i].toString());
			}
		}
		scan.close();
	}

}
