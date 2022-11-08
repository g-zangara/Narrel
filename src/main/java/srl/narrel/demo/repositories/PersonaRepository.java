package srl.narrel.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import srl.narrel.demo.models.PersonaModel;

public interface PersonaRepository extends JpaRepository<PersonaModel, Integer> {
 
}