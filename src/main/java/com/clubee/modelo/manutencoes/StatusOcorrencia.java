package com.clubee.modelo.manutencoes;

public enum StatusOcorrencia {
	
	ABERTA("Aberta"),
	EM_ANDAMENTO("Em andamento"),
	CANCELADA("Cancelada"),
	CONCLUIDA("Concluída");
	
	private String descricao;
	
	StatusOcorrencia(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
