package srl.narrel.demo.Mapper;

import org.springframework.stereotype.Component;
import srl.narrel.demo.dto.RiunioneDTO;
import srl.narrel.demo.models.RiunioneModel;

import java.util.ArrayList;

@Component
public class RiunioneMapper {
    public RiunioneDTO toDto(RiunioneModel riunioneModel){
        return RiunioneDTO.builder()
                .id(riunioneModel.getId())
                .data(riunioneModel.getData())
                .location(riunioneModel.getLocation())
                .build();
    }

    public RiunioneModel toRiunione(RiunioneDTO riunioneDTO){
        return RiunioneModel.builder()
                .id(riunioneDTO.id())
                .data(riunioneDTO.data())
                .location(riunioneDTO.location())
                .invitati(new ArrayList<>())
                .partecipanti(new ArrayList<>())
                .build();
    }
}
