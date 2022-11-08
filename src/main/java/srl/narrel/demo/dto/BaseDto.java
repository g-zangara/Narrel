package srl.narrel.demo.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class BaseDto {
    private Integer id;
    private String errorEncountered;
    private int errorCode;
}
