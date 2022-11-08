package srl.narrel.demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
@Builder
public class PersonaDTO {
	private Integer id;
	private String errorEncountered;
	private int errorCode;
	//ClassDto inherits father's fields
	private String nome;
	private String cognome;
	private String codiceFiscale;
}
