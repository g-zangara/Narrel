package srl.narrel.demo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class CondominioDTO extends BaseDto{

	//ClassDto inherits father's field
	private String nome;
	private String via;

	
}
