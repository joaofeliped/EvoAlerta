package com.clubee.modelo.fundacoes;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Localizacao {
	
	@Column(length = 180)
	private String pais;
	
	@Column(length = 180)
	private String regiao;
	
	@Column(length = 180)
	private String cidade;

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
