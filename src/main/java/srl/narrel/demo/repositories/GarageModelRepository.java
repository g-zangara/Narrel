package srl.narrel.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import srl.narrel.demo.models.GarageModel;


public interface GarageModelRepository extends JpaRepository<GarageModel, Long> {
 
}