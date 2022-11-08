package srl.narrel.demo.Mapper;

import org.springframework.stereotype.Component;
import srl.narrel.demo.dto.AppartamentoDTO;
import srl.narrel.demo.models.AppartamentoModel;

@Component
public class AppartamentoMapper {
    public AppartamentoDTO toDto(AppartamentoModel appartamentoModel){
        return AppartamentoDTO.builder()
                .id(appartamentoModel.getId())
                .numero(appartamentoModel.getNumero())
                .piano(appartamentoModel.getPiano())
                .metratura(appartamentoModel.getMetratura())
                .build();
    }

    public AppartamentoModel toAppartamentoModel(AppartamentoDTO appartamentoDTO){
        return null; //i have to modify model.
    }
}
