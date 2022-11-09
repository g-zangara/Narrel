package srl.narrel.demo.Mapper;

import org.springframework.stereotype.Component;
import srl.narrel.demo.dto.CondominioDTO;
import srl.narrel.demo.models.CondominioModel;

@Component
public class CondominioMapper {
    public CondominioDTO toDto(CondominioModel condominio){
        return CondominioDTO.builder().id(condominio.getId())
                .nome(condominio.getNome())
                .via(condominio.getVia())
                .build();
    }

    public CondominioModel toCondominio(CondominioDTO condominioDTO){
        return CondominioModel.builder()
                .id(condominioDTO.id())
                .nome(condominioDTO.nome())
                .via(condominioDTO.via())
                .build();
    }
}
