package srl.narrel.demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import srl.narrel.demo.models.CondominioModel;

@Data
@Accessors(fluent = true)
@Builder
public class GarageDTO {
	private Integer id;
	private String errorEncountered;
	private int errorCode;
	//ClassDto inherits father's field
	private CondominioModel condominio;
	private int numero;
	private float consumoElettrico;
	
}
