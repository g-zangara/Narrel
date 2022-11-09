package srl.narrel.demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import srl.narrel.demo.models.CondominioModel;

@Data
@Accessors(fluent = true)
@Builder
public class AppartamentoDTO {
	private Integer id;
	private String errorEncountered;
	private int errorCode;
	private CondominioModel condominio;
	private int piano;
	private int numero;
	private double metratura;
	private double consumoRiscaldamento;

	//For now we ometted owner's list, because we could let the user set them late, (MAYBE)
}
