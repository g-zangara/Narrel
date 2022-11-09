package srl.narrel.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srl.narrel.demo.models.CondominioModel;
import srl.narrel.demo.repositories.CondominioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CondominioService {
    @Autowired
    private CondominioRepository condominioRepository;

    public Optional<CondominioModel> getById(Integer id){
        return condominioRepository.findById(id);
    }

    public List<CondominioModel> findByNome(String nome){
        return condominioRepository.findByNome(nome);
    }

    public List<CondominioModel> findByVia(String via){
        return condominioRepository.findByVia(via);
    }

    public void delete(Integer id){
        condominioRepository.deleteById(id);
    }

    public CondominioModel add(CondominioModel condominio){
        return condominioRepository.save(condominio);
    }
}
