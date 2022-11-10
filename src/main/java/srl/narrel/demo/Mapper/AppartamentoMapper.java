package srl.narrel.demo.Mapper;

import org.springframework.stereotype.Component;
import srl.narrel.demo.dto.AppartamentoDTO;
import srl.narrel.demo.models.AppartamentoModel;
import srl.narrel.demo.models.CondominioModel;

@Component
public class AppartamentoMapper {
    public AppartamentoDTO toDto(AppartamentoModel model){
       AppartamentoDTO dto = new AppartamentoDTO();
       
       dto.setCondominioId(model.getCondominio().getId());
       dto.setPiano(model.getPiano());
       dto.setNumero(model.getNumero());
       dto.setMetratura(model.getMetratura());
       dto.setConsumoRiscaldamento(model.getConsumoRiscaldamento());
       
       return dto;
    }

    public AppartamentoModel toModel(AppartamentoDTO dto){
        return new AppartamentoModel(dto.getId(), new CondominioModel(dto.getCondominioId()),dto.getPiano(),dto.getNumero(),dto.getMetratura(),dto.getConsumoRiscaldamento());
    }
}
