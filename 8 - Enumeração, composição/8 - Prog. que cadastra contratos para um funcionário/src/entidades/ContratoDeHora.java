package entidades;

import java.util.Date;

public class ContratoDeHora {
	
	private Date data;
	private double valorPorHora;
	private int horas;
	
	
	
	public ContratoDeHora(Date data, Double valorPorHora, int horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}


	public double valorTotal() {
		return horas * valorPorHora;
	}
	

	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public Double getValorPorHora() {
		return valorPorHora;
	}



	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}



	public double getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}

}
