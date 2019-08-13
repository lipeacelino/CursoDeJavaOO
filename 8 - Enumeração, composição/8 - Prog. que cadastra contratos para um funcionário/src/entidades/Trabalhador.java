package entidades;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Trabalhador {
	
	private String name;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<ContratoDeHora> contrato = new ArrayList<>();
	
	
	
	
	public void addContrato(ContratoDeHora contrato) {
		this.contrato.add(contrato);
	}
	
	public void delContrato(ContratoDeHora contrato) {
		this.contrato.remove(contrato);
	}
	
	public double renda(int mes, int ano) {
		
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (ContratoDeHora c : contrato) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1+cal.get(Calendar.MONTH);
			
			if (c_ano == ano && c_mes == mes) {
				soma += c.valorTotal();
			}
		}
		
		return soma;
		
	}
	
	

	public Trabalhador(String name, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.name = name;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoDeHora> getContrato() {
		return contrato;
	}
	

}
