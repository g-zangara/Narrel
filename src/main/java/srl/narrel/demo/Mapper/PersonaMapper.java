package srl.narrel.demo.Mapper;

import org.springframework.stereotype.Component;
import srl.narrel.demo.dto.PersonaDTO;
import srl.narrel.demo.models.AppartamentoModel;
import srl.narrel.demo.models.PersonaModel;
import srl.narrel.demo.models.RiunioneModel;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonaMapper {
    private List<Integer> appartamentiId;
	private List<Integer> invitiId;
	private List<Integer> partecipantiId;

	public PersonaDTO toDto(PersonaModel model){
    	PersonaDTO dto = new PersonaDTO();
    	
    	dto.setId(model.getId());
    	dto.setNome(model.getNome());
    	dto.setCognome(model.getCognome());
    	dto.setCodiceFiscale(model.getCodiceFiscale());
    	
    	appartamentiId = null;
    	for(AppartamentoModel a : model.getAppartamenti()) {
    		appartamentiId.add(a.getId());
    	}
    	dto.setAppartamentiId(appartamentiId);
    	
    	invitiId = null;
    	for(RiunioneModel r : model.getInviti()) {
    		invitiId.add(r.getId());
    	}
    	dto.setRiunioniInviti(invitiId);
    	
    	partecipantiId = null;
    	for(RiunioneModel r : model.getPartecipazioni()) {
    		partecipantiId.add(r.getId());
    	}
    	dto.setRiunioniPartecipate(partecipantiId);
    	
    	return dto;
    }

    public PersonaModel toPersona(PersonaDTO dto){
        return new PersonaModel(dto.getId(),dto.getNome(),dto.getCognome(),dto.getCodiceFiscale(), new ArrayList<AppartamentoModel>(), new ArrayList<RiunioneModel>(), new ArrayList<RiunioneModel>());
    }
}
