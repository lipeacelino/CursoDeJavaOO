package util;

public class ConversorDeMoedas {
	
	private static double dolar;
	private static double qtdDolar;
	private static final double IOF = 1.06; //6%
	
	
	public static void setDolar(double dolar) {
		ConversorDeMoedas.dolar = dolar;
	}
	
	public static void setQtdDolar(double qtdDolar) {
		ConversorDeMoedas.qtdDolar = qtdDolar;
	}
	
	public static double conversor() {
		double resultado = (IOF * dolar) * qtdDolar;
		return resultado;
	}
}
