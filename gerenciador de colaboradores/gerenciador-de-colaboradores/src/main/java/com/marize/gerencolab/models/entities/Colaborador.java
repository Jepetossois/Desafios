package com.marize.gerencolab.models.entities;

import java.math.BigDecimal;

import com.marize.gerencolab.models.enums.ColaboradorSetor;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Colaborador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String office;
	private BigDecimal wage;
	
	@Enumerated(EnumType.STRING)
	private ColaboradorSetor setor;
	
	public void setSetor(ColaboradorSetor setor) {
		this.setor = setor;
	}
	
	public Colaborador() {
	}

	public Colaborador(String name, String email, String office, BigDecimal wage, ColaboradorSetor setor) {
		super();
		this.name = name;
		this.email = email;
		this.office = office;
		this.wage = wage;
		this.setor = setor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public BigDecimal getWage() {
		return wage;
	}

	public void setWage(BigDecimal wage) {
		this.wage = wage;
	}

	public ColaboradorSetor getSetor() {
		return setor;
	}
	
	
}
