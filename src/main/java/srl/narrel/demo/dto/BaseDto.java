package srl.narrel.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@Accessors(fluent = true)
public class BaseDto {
    private int id;
    private boolean errorEncountered;
    private int errorCode;
}
