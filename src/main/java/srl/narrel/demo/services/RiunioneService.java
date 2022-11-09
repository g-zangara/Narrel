package srl.narrel.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.narrel.demo.models.RiunioneModel;
import srl.narrel.demo.repositories.RiunioneRepository;

import java.util.Optional;

@Service
public class RiunioneService {
    @Autowired
    private RiunioneRepository riunioneRepository;

    public Optional<RiunioneModel> findById(Integer id){
        return riunioneRepository.findById(id);
    }
    public RiunioneModel add(RiunioneModel riunioneModel){
        return riunioneRepository.save(riunioneModel);
    }

    public void delete(Integer id){
        riunioneRepository.deleteById(id);
    }
}
