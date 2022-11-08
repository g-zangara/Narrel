package srl.narrel.demo.dto;

import lombok.Data;
import srl.narrel.demo.models.CondominioModel;

@Data
public class GarageDTO extends BaseDto{
	//ClassDto inherits father's field
	private CondominioModel condominio;
	private int numero;
	private double consumoElettrico;
	
}
