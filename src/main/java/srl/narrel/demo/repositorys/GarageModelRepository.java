package srl.narrel.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import srl.narrel.demo.models.GarageModel;


public interface GarageModelRepository extends JpaRepository<GarageModel, Long> {
 
}