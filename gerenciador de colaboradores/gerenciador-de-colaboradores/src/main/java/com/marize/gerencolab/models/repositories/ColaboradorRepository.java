package com.marize.gerencolab.models.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marize.gerencolab.models.entities.Colaborador;
import com.marize.gerencolab.models.enums.ColaboradorSetor;
@Repository
public interface ColaboradorRepository extends JpaRepository<Colaborador, Integer>{
	
	List<Colaborador> findBySetor(ColaboradorSetor colaboradorSetor);

}
