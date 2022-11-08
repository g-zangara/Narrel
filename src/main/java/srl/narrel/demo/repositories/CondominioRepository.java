package srl.narrel.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import srl.narrel.demo.models.CondominioModel;

public interface CondominioRepository extends JpaRepository<CondominioModel, Integer> {
 
}