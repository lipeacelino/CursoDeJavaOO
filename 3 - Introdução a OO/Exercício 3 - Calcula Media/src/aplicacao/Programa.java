package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Estudante;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Estudante estud = new Estudante();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do estudante: ");
		estud.nome = sc.nextLine();
		estud.nota1 = sc.nextDouble();
		estud.nota2 = sc.nextDouble();
		estud.nota3 = sc.nextDouble();
		
		System.out.println("Pontuação: " + estud.calculaNota());
		if (estud.calculaNota() >= 60) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
			System.out.println("Faltando: " + estud.quantoFalta());
		}
		/*
		System.out.println("Nota final: " + estud.calculaNota());
		estud.situacao();
		*/
	}

}
