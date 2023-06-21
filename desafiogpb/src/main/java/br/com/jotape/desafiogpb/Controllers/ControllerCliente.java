package br.com.jotape.desafiogpb.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.jotape.desafiogpb.Model.Repositories.ClienteRepository;
import br.com.jotape.desafiogpb.Model.entities.Cliente;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/clientes")
public class ControllerCliente {
	
	@Autowired
	private ClienteRepository repository;
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public Cliente salvarCliente(@Valid Cliente cliente) {
		repository.save(cliente);
		return cliente;
	}

}
