package srl.narrel.demo.dto;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;

@Data
@Accessors(fluent = true)
@Builder
public class CondominioDTO {
	private Integer id;
	private String errorEncountered;
	private int errorCode;
	private String nome;
	private String via;
}
