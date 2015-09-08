package com.clubee.modelo.rotinas;

public enum StatusRotina {
	
	ABERTO("Aberto"),
	CONCLUIDO("Concluído"), 
	ATRASADO("Atrasado"),
	EM_ESPERA("Em espera"),
	EM_ANDAMENTO("Em andamento");
	
	private String descricao;
	
	StatusRotina(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
