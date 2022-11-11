package srl.narrel.demo.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srl.narrel.demo.dto.AppartamentoDTO;
import srl.narrel.demo.models.AppartamentoModel;
import srl.narrel.demo.repositories.AppartamentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AppartamentoService {
    @Autowired
    private static AppartamentoRepository appartamentoRepository;

    public List<AppartamentoModel> getAll(){
        return appartamentoRepository.findAll();
    }

    public Optional<AppartamentoModel> getById(Integer id){
        return appartamentoRepository.findById(id);
    }

   public void delete(Integer id){
        appartamentoRepository.deleteById(id);
   }

   public static AppartamentoDTO add(AppartamentoDTO appartamentoDto){
	   
	   AppartamentoModel appartamento = new AppartamentoModel(); 
	   BeanUtils.copyProperties(appartamentoDto, appartamento);
	   
	   appartamento=appartamentoRepository.save(appartamento);
	   
	   BeanUtils.copyProperties(appartamento, appartamentoDto);
	   
        return appartamentoDto;
   }

}
