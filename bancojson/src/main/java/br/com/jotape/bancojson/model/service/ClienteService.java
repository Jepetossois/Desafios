package br.com.jotape.bancojson.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.jotape.bancojson.model.entities.Cliente;
import br.com.jotape.bancojson.model.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public void saveClienteFromJson(String json) {
		ObjectMapper om = new ObjectMapper();
		List<Cliente> clientes;
		
		try {
			clientes = om.readValue(json, new TypeReference<List<Cliente>>() {});
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return;
		}
		
		repository.saveAll(clientes);
	}

}
