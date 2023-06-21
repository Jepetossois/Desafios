package br.com.jotape.bancojson.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.jotape.bancojson.model.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>, PagingAndSortingRepository<Cliente, Integer>{

}
