package srl.narrel.demo.Mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import srl.narrel.demo.dto.CondominioDTO;
import srl.narrel.demo.models.AppartamentoModel;
import srl.narrel.demo.models.CondominioModel;
import srl.narrel.demo.models.GarageModel;

@Component
public class CondominioMapper {
    private List<Integer> appartamentiId;
	private List<Integer> garageId;

	public CondominioDTO toDto(CondominioModel model){
        CondominioDTO dto= new CondominioDTO();
        dto.setId(model.getId());
        dto.setNome(model.getNome());
        dto.setVia(model.getVia());
        appartamentiId = null;
        for(AppartamentoModel a: model.getAppartamenti()) {
        	appartamentiId.add(a.getId());
        }
        dto.setAppartamentiId(appartamentiId);
        garageId = null;
        for(GarageModel g: model.getGarages()) {
        	garageId.add(g.getId());
        }
        dto.setGarageId(garageId);
        return dto;
    }

    public CondominioModel toCondominio(CondominioDTO dto){
        return new CondominioModel(dto.getId(),dto.getNome(),dto.getVia(), new ArrayList<AppartamentoModel>(), new ArrayList<GarageModel>());
    }
}
