package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Entre com os valores de X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com os valores de y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		
		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));
		
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p-yA) * (p-yB) * (p-yC));
		
		System.out.printf("Área do triangulo X: %.4f \n", areaX);
		System.out.printf("Área do triangulo Y: %.4f \n", areaY);
		
		System.out.printf("Triângulo de maior área: %s \n", areaX > areaY ? "X" : "Y");
		System.out.println(areaY + areaX);
		sc.close();
	}

}

