package srl.narrel.demo.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@Builder
public class PersonaDTO extends BaseDTO{
	
	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	private List<Integer> appartamentiId;
	private List<Integer> riunioniInviti;
	private List<Integer> riunioniPartecipate;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public List<Integer> getAppartamentiId() {
		return appartamentiId;
	}
	public void setAppartamentiId(List<Integer> appartamentiId) {
		this.appartamentiId = appartamentiId;
	}
	public List<Integer> getRiunioniInviti() {
		return riunioniInviti;
	}
	public void setRiunioniInviti(List<Integer> riunioniInviti) {
		this.riunioniInviti = riunioniInviti;
	}
	public List<Integer> getRiunioniPartecipate() {
		return riunioniPartecipate;
	}
	public void setRiunioniPartecipate(List<Integer> riunioniPartecipate) {
		this.riunioniPartecipate = riunioniPartecipate;
	}
	
	
}
