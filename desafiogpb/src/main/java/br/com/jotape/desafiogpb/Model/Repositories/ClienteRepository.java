package br.com.jotape.desafiogpb.Model.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.jotape.desafiogpb.Model.entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>, PagingAndSortingRepository<Cliente , Integer>{


}
