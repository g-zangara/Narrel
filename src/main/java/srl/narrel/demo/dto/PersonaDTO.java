package srl.narrel.demo.dto;

import lombok.Data;

@Data
public class PersonaDTO extends BaseDto{
	//ClassDto inherits father's fields
	private String nome;
	private String cognome;
	private String codiceFiscale;
}
