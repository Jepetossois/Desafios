package com.marize.gerencolab.models.enums;

public enum ColaboradorSetor {
	DEPARTAMENTO_PESSOAL("departamento_pessoal"), 
	DEPARTAMENTO_FISCAL("departamento_fiscal"), 
	DEPARTAMENTO_CONTABIL("departamento_contabil"), 
	DEPARTAMENTO_JURIDICO("departamento_juridico");
	
	private String value;
	
	private ColaboradorSetor(String value) {
		this.value = value;
	}
	
	public String getSetor() {
		return value;
	}
	
	
}
