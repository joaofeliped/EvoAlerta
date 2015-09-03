package com.clubee.modelo.manutencoes;

public enum StatusTarefa {
	
	ABERTO("Aberto"),
	CONCLUIDO("Concluído");
	
	private String descricao;
	
	StatusTarefa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
