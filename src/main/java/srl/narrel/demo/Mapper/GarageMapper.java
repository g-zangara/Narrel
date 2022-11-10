package srl.narrel.demo.Mapper;

import org.springframework.stereotype.Component;
import srl.narrel.demo.dto.GarageDTO;
import srl.narrel.demo.models.CondominioModel;
import srl.narrel.demo.models.GarageModel;

@Component
public class GarageMapper {
    public GarageDTO toDto(GarageModel model){
        GarageDTO dto = new GarageDTO();
        
        dto.setId(model.getId());
        dto.setNumero(model.getNumero());
        dto.setCondominioId(model.getCondominio().getId());
        dto.setConsumoElettrico(model.getConsumoElettrico());
        
        return dto;
    }

    public GarageModel toGarage(GarageDTO dto){
        return new GarageModel(dto.getId(),dto.getNumero(),new CondominioModel(dto.getCondominioId()),dto.getConsumoElettrico());
    }
}
