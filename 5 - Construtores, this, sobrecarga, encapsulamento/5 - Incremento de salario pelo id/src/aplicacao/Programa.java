package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		List<Funcionario> funcionarioLista = new ArrayList<Funcionario>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionários quer cadastrar? ");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			System.out.println();
			System.out.println("Empregado #" + (i + 1));
			System.out.println("ID: ");
			int id = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			funcionarioLista.add(new Funcionario(nome, id, salario));
		}

		System.out.println();
		System.out.println("Digite o código do funcionário que deseja incrementar o salário:  ");
		int cod = sc.nextInt();
		Funcionario f = funcionarioLista.stream().filter(x -> x.getId() == cod).findFirst().orElse(null);

		if (f == null) {
			System.out.println("Este código não existe!");
		} else {
			System.out.println("Digite a porcentagem de aumento: ");
			int porcentagem = sc.nextInt();
			f.incrementaSalario(porcentagem);
			for (Funcionario func : funcionarioLista) {
				System.out.println(func.toString());	
			}
		}
		sc.close();
	}

}
