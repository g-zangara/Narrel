package srl.narrel.demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@Builder
public class GarageDTO extends BaseDTO{
		
	private Integer condominioId;
	private int numero;
	private float consumoElettrico;
	
	public Integer getCondominioId() {
		return condominioId;
	}
	public void setCondominioId(Integer condominioId) {
		this.condominioId = condominioId;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getConsumoElettrico() {
		return consumoElettrico;
	}
	public void setConsumoElettrico(float consumoElettrico) {
		this.consumoElettrico = consumoElettrico;
	}		
	
}
