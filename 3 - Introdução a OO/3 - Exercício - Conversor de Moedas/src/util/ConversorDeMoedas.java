package util;

public class ConversorDeMoedas {
	public static double valorEmReais(double valorDolar, double qtdDolar) {
		double iof = valorDolar * 0.06;
		return qtdDolar * (valorDolar + iof);
	}
}
