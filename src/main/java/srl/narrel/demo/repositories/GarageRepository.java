package srl.narrel.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import srl.narrel.demo.models.GarageModel;

import java.util.List;
import java.util.Optional;


public interface GarageRepository extends JpaRepository<GarageModel, Integer> {
    public Optional<GarageModel> findByCondominioIdAndNumero(Integer condominioId,int numero);
    public List<GarageModel> findByConsumoelettrico(float consumoElettrico);
 
}