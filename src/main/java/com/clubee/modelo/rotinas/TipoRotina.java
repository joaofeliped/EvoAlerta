package com.clubee.modelo.rotinas;

public enum TipoRotina {

	AGENDADA("Agendada"), 
	PREVENTIVA("Preventiva");

	private String descricao;

	TipoRotina(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
