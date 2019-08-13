package aplicacao;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entidades.Departamento;
import entidades.NivelTrabalhador;
import entidades.Trabalhador;
import entidades.ContratoDeHora;

public class Programa {

	public static void main (String [] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre como nome do departamento: ");
		String departamento = scan.nextLine();
		
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		System.out.print("Nível: ");
		String nivel = scan.nextLine();
		System.out.print("Salário base: ");
		double salario = scan.nextDouble();
		
		System.out.print("Quantos contratos para esse trabalhador? ");
		System.out.println();
		int qtd = scan.nextInt();
		scan.nextLine();
		
		Departamento dep = new Departamento(departamento);
		Trabalhador trab = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel.toUpperCase()), salario, dep);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Entre com os dados do contrato #"+i+":" );
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataDoContrato = sdf.parse(scan.nextLine());
			System.out.print("Valor por hora: ");
			double valorPorHora = scan.nextDouble();
			System.out.print("Duração (horas): ");
			int duracao = scan.nextInt();
			scan.nextLine();
			System.out.println("");
			
			ContratoDeHora contrato = new ContratoDeHora(dataDoContrato, valorPorHora, duracao);
			trab.addContrato(contrato);
			
		}
		
		System.out.print("Entre com a data para calcular o mês e o ano (MM/YYY): ");
		System.out.println();
		String data  = scan.nextLine();
		int mes = Integer.parseInt(data.substring(0,2));
		int ano = Integer.parseInt(data.substring(3));
		
		System.out.println("Nome: " + trab.getName());
		System.out.println("Departamento: " + trab.getDepartamento().getNome());
		System.out.printf("Renda: %.2f", trab.renda(mes, ano));
		
		scan.close();
	}
	
}
