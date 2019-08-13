package aplicacao;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.println("Nome: ");
		func.nome = sc.nextLine();
		System.out.println("Salário: ");
		func.salario = sc.nextDouble();
		System.out.println("Imposto: ");
		func.imposto = sc.nextDouble();
		System.out.println("Funcionario: " + func);
		System.out.println();
		System.out.println("Qual é a porcentagem de acréscimo? ");
		double porcentagem = sc.nextDouble();
		func.incrementarSalario(porcentagem);
		System.out.println();
		System.out.println("Dados atualizados: " + func);
		
		sc.close();
	}
}
