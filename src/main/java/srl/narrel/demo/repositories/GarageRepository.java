package srl.narrel.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import srl.narrel.demo.models.GarageModel;


public interface GarageRepository extends JpaRepository<GarageModel, Long> {
 
}