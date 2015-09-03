package com.clubee.modelo.fundacoes;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	@Column(length = 12)
	private String cep;
	
	@Column(length = 180)
	private String logradouro;
	
	@Column(name = "complemento_1", length = 180 )
	private String complemento1;
	
	@Column(name = "complemento_2", length = 180)
	private String complemento2;
	
	@Column(length = 180)
	private String bairro;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento1() {
		return complemento1;
	}

	public void setComplemento1(String complemento1) {
		this.complemento1 = complemento1;
	}

	public String getComplemento2() {
		return complemento2;
	}

	public void setComplemento2(String complemento2) {
		this.complemento2 = complemento2;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
