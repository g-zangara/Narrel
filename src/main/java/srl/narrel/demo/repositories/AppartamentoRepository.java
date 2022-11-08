package srl.narrel.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import srl.narrel.demo.models.AppartamentoModel;

public interface AppartamentoRepository extends JpaRepository<AppartamentoModel, Long> {
 
}