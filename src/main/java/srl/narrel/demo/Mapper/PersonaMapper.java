package srl.narrel.demo.Mapper;

import org.springframework.stereotype.Component;
import srl.narrel.demo.dto.PersonaDTO;
import srl.narrel.demo.models.PersonaModel;

import java.util.ArrayList;

@Component
public class PersonaMapper {
    public PersonaDTO toDto(PersonaModel personaModel){
        return PersonaDTO.builder()
                .id(personaModel.getId())
                .nome(personaModel.getNome())
                .cognome(personaModel.getCognome())
                .codiceFiscale(personaModel.getCodiceFiscale())
                .build();
    }

    public PersonaModel toPersona(PersonaDTO personaDTO){
        return PersonaModel.builder()
                .id(personaDTO.id())
                .nome(personaDTO.nome())
                .cognome(personaDTO.cognome())
                .codiceFiscale(personaDTO.codiceFiscale())
                .appartamenti(new ArrayList<>())
                .inviti(new ArrayList<>())
                .partecipazioni(new ArrayList<>())
                .build();
    }
}
