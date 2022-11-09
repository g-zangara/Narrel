package srl.narrel.demo.Mapper;

import org.springframework.stereotype.Component;
import srl.narrel.demo.dto.GarageDTO;
import srl.narrel.demo.models.GarageModel;

@Component
public class GarageMapper {
    public GarageDTO toDto(GarageModel garage){
        return GarageDTO.builder()
                .id(garage.getId())
                .numero(garage.getNumero())
                .condominio(garage.getCondominio())
                .consumoElettrico(garage.getConsumoElettrico())
                .build();
    }

    public GarageModel toGarage(GarageDTO garageDTO){
        return GarageModel.builder()
                .id(garageDTO.id())
                .numero(garageDTO.numero())
                .condominio(garageDTO.condominio())
                .consumoElettrico(garageDTO.consumoElettrico())
                .build();
    }
}
