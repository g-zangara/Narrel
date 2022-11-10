package srl.narrel.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.narrel.demo.models.GarageModel;
import srl.narrel.demo.repositories.GarageRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GarageService {
    @Autowired
    private GarageRepository garageRepository;

    public Optional<GarageModel> findById(Integer id){
        return garageRepository.findById(id);
    }
    public List<GarageModel> getAll(){
        return garageRepository.findAll();
    }

    public Optional<GarageModel> findByCondominioAndNumero(Integer condominioId,int numero){
        return garageRepository.findByCondominioIdAndNumero(condominioId,numero);
    }

    public List<GarageModel> findByConsumoelettrico(float consumo){
        return garageRepository.findByConsumoelettrico(consumo);
    }

    public void delete(Integer id){
        garageRepository.deleteById(id);
    }

    public GarageModel add(GarageModel garage){
        return garageRepository.save(garage);
    }
}
