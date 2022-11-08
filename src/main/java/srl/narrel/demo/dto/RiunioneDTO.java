package srl.narrel.demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(fluent = true)
@Builder
public class RiunioneDTO{
	private Integer id;
	private String errorEncountered;
	private int errorCode;

	//Class dto inherits father's field
	private String location;
	private Date data;
	
}
