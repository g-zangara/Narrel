package srl.narrel.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import srl.narrel.demo.dto.AppartamentoDTO;
import srl.narrel.demo.services.AppartamentoService;

@RestController
public class AppartamentoController {
	
	@Autowired
	AppartamentoService appartamentoService;
	
	@PostMapping(path="/add")
	public AppartamentoDTO createAppartamento(@RequestBody AppartamentoDTO appartamentoDTO) {
		return AppartamentoService.add(appartamentoDTO);
	}

}
