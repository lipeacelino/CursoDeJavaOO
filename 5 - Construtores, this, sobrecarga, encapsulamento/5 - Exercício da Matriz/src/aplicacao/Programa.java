package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número de linhas e colunas da matriz: ");
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		int [][] mat = new int[linha][coluna];
		
		for (int m = 0; m < mat.length; m++) {
			for (int n = 0; n <mat[m].length; n++) {
				mat[m][n] = sc.nextInt();
			}
		}
		
		int numero = sc.nextInt();
		
		for (int m = 0; m < mat.length; m++) {
			for (int n = 0; n < mat[m].length; n++) {
				if(mat[m][n] == numero) {
					System.out.println(mat[m][n]);
					
					if (m > 0) {
						//valor à esquerda
						System.out.println("Esquerda: " + mat[m][n-1]);
					}
					/*
					int teste = mat[m].length;
					if (n < teste/*mat[m].length) {
						//valor à direita
						System.out.println("Direita: " + mat[m][n+1]);
					}
					*/
					
					if (n < mat[m].length - 1) {
							//valor à direita
							System.out.println("Direita: " + mat[m][n+1]);
					}
					
					if (m > 0) {
						//valor acima
						System.out.println("Cima: " + mat[m-1][n]);
					}
					
					
					if (m < mat.length) {
						//valor abaixo
						System.out.println("Baixo: " + mat[m+1][n]);
					}
					
				};
			}
		}
	sc.close();
	}

}
