package srl.narrel.demo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class RiunioneDTO extends BaseDto{

	//Class dto inherits father's field
	private String location;
	private Date data;
	
}
