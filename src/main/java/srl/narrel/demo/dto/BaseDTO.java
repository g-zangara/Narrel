package srl.narrel.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@Accessors(fluent = true)
public class BaseDTO {
    private int id;
    private boolean errorEncountered;
    private int errorCode;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isErrorEncountered() {
		return errorEncountered;
	}
	public void setErrorEncountered(boolean errorEncountered) {
		this.errorEncountered = errorEncountered;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
    
    
    
}
