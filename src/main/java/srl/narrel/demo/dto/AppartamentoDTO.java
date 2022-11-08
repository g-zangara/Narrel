package srl.narrel.demo.dto;

import lombok.Data;
import srl.narrel.demo.models.CondominioModel;

@Data
public class AppartamentoDTO extends BaseDto {
	//Each ClassDto inherits father's field
	//We put in the child dto only the parameter we need to expose
	private CondominioModel condominio;
	private int piano;
	private int numero;
	private double metratura;
	private double consumoRiscaldamento;

	//For now we ometted owner's list, because we could let the user set them late, (MAYBE)
}
