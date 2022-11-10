package srl.narrel.demo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@Data
@Accessors(fluent = true)
@Builder
public class RiunioneDTO extends BaseDTO{
	
	
	private String location;
	private Date data;
	
	private List<Integer> invitatiId; //personeID per capirci
	private List<Integer> partecipantiId; //idem sopra
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public List<Integer> getInvitatiId() {
		return invitatiId;
	}
	public void setInvitatiId(List<Integer> invitatiId) {
		this.invitatiId = invitatiId;
	}
	public List<Integer> getPartecipantiId() {
		return partecipantiId;
	}
	public void setPartecipantiId(List<Integer> partecipantiId) {
		this.partecipantiId = partecipantiId;
	}
	
		
	
}
