package com.clubee.modelo.ativos;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class DadosDataEquipamento {
	
	@Temporal(TemporalType.DATE)
	private Date dataDeCriacao;
	
	@Temporal(TemporalType.DATE)
	private Date dataDeCompra;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDeInstalacao;
	
	@Temporal(TemporalType.DATE)
	private Date dataDaUltimaManutencao;
	
	@Temporal(TemporalType.DATE)
	private Date dataDaProximaManutencao;
	
	@Temporal(TemporalType.DATE)
	private Date dataDeDesligamento;

	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public Date getDataDeCompra() {
		return dataDeCompra;
	}

	public void setDataDeCompra(Date dataDeCompra) {
		this.dataDeCompra = dataDeCompra;
	}

	public Date getDataDeInstalacao() {
		return dataDeInstalacao;
	}

	public void setDataDeInstalacao(Date dataDeInstalacao) {
		this.dataDeInstalacao = dataDeInstalacao;
	}

	public Date getDataDaUltimaManutencao() {
		return dataDaUltimaManutencao;
	}

	public void setDataDaUltimaManutencao(Date dataDaUltimaManutencao) {
		this.dataDaUltimaManutencao = dataDaUltimaManutencao;
	}

	public Date getDataDaProximaManutencao() {
		return dataDaProximaManutencao;
	}

	public void setDataDaProximaManutencao(Date dataDaProximaManutencao) {
		this.dataDaProximaManutencao = dataDaProximaManutencao;
	}

	public Date getDataDeDesligamento() {
		return dataDeDesligamento;
	}

	public void setDataDeDesligamento(Date dataDeDesligamento) {
		this.dataDeDesligamento = dataDeDesligamento;
	}
}
