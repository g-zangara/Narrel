package srl.narrel.demo.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import srl.narrel.demo.models.PersonaModel;

public interface PersonaModelRepository extends JpaRepository<PersonaModel, Long> {
 
}