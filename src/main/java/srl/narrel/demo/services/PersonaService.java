package srl.narrel.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.narrel.demo.models.PersonaModel;
import srl.narrel.demo.repositories.PersonaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public List<PersonaModel> getAll(){
        return personaRepository.findAll();
    }

    public Optional<PersonaModel> findById(Integer id){
        return personaRepository.findById(id);
    }

    public void delete(Integer id){
        personaRepository.deleteById(id);
    }

    public PersonaModel add(PersonaModel persona){
        return personaRepository.save(persona);
    }
}
