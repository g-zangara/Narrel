package srl.narrel.demo.Mapper;

import org.springframework.stereotype.Component;
import srl.narrel.demo.dto.RiunioneDTO;
import srl.narrel.demo.models.PersonaModel;
import srl.narrel.demo.models.RiunioneModel;

import java.util.ArrayList;
import java.util.List;

@Component
public class RiunioneMapper {
	
	private List<Integer> invitatiId;
	private List<Integer> partecipantiId;
	
    public RiunioneDTO toDto(RiunioneModel model){
        RiunioneDTO dto = new RiunioneDTO();
        
        dto.setId(model.getId());
        dto.setData(model.getData());
        dto.setLocation(model.getLocation());
        
        invitatiId = null;
    	for(PersonaModel p : model.getInvitati()) {
    		invitatiId.add(p.getId());
    	}
    	dto.setInvitatiId(invitatiId);
    	
    	partecipantiId = null;
    	for(PersonaModel p : model.getPartecipanti()) {
    		partecipantiId.add(p.getId());
    	}
    	dto.setPartecipantiId(partecipantiId);
        
        return dto;
    }

    public RiunioneModel toRiunione(RiunioneDTO dto){
        return new RiunioneModel(dto.getId(),dto.getData(),dto.getLocation(), new ArrayList<PersonaModel>(), new ArrayList<PersonaModel>());
    }
}
