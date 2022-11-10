package srl.narrel.demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@Builder
public class AppartamentoDTO extends BaseDTO {
	
	private Integer condominioId;
	private int piano;
	private int numero;
	private double metratura;
	private double consumoRiscaldamento;
	
	public Integer getCondominioId() {
		return condominioId;
	}
	public void setCondominioId(Integer condominioId) {
		this.condominioId = condominioId;
	}
	public int getPiano() {
		return piano;
	}
	public void setPiano(int piano) {
		this.piano = piano;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getMetratura() {
		return metratura;
	}
	public void setMetratura(double metratura) {
		this.metratura = metratura;
	}
	public double getConsumoRiscaldamento() {
		return consumoRiscaldamento;
	}
	public void setConsumoRiscaldamento(double consumoRiscaldamento) {
		this.consumoRiscaldamento = consumoRiscaldamento;
	}

	
	
}
