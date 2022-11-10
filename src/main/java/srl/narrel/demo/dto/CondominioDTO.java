package srl.narrel.demo.dto;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;


@Data
@Accessors(fluent = true)
@Builder
public class CondominioDTO extends BaseDTO {
	
	private String nome;
	private String via;
	private List<Integer> appartamentiId;
	private List<Integer> garageId;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public List<Integer> getAppartamentiId() {
		return appartamentiId;
	}
	public void setAppartamentiId(List<Integer> appartamentiId) {
		this.appartamentiId = appartamentiId;
	}
	public List<Integer> getGarageId() {
		return garageId;
	}
	public void setGarageId(List<Integer> garageId) {
		this.garageId = garageId;
	}
			
}
