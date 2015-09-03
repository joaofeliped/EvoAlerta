package com.clubee.modelo.ativos;

public enum StatusEquipamento {
	
	EM_EVENTO("Em evento"),
	EM_FUNCIONAMENTO("Em funcionamento"),
	EM_MANUTENCAO("Em manutenção"),
	VENDIDO("Vendido");
	
	private String descricao;
	
	StatusEquipamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
