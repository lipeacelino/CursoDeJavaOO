package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;


public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os valores de X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os valores de y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.calculaArea();
		double areaY = y.calculaArea();
		
		System.out.printf("Área do triangulo X: %.4f \n", areaX);
		System.out.printf("Área do triangulo Y: %.4f \n", areaY);
		
		System.out.printf("Triângulo de maior área: %s \n", areaX > areaY ? "X" : "Y");
		sc.close();
	}

}

