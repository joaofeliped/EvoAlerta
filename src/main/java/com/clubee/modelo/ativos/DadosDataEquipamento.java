package com.clubee.modelo.ativos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class DadosDataEquipamento {

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_criacao")
	private Date dataCriacao;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_compra")
	private Date dataCompra;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_instalacao")
	private Date dataInstalacao;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_ultima_manutencao")
	private Date dataUltimaManutencao;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_proxima_manutencao")
	private Date dataProximaManutencao;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_desligamento")
	private Date dataDesligamento;

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Date getDataInstalacao() {
		return dataInstalacao;
	}

	public void setDataInstalacao(Date dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}

	public Date getDataUltimaManutencao() {
		return dataUltimaManutencao;
	}

	public void setDataUltimaManutencao(Date dataUltimaManutencao) {
		this.dataUltimaManutencao = dataUltimaManutencao;
	}

	public Date getDataProximaManutencao() {
		return dataProximaManutencao;
	}

	public void setDataProximaManutencao(Date dataProximaManutencao) {
		this.dataProximaManutencao = dataProximaManutencao;
	}

	public Date getDataDesligamento() {
		return dataDesligamento;
	}

	public void setDataDesligamento(Date dataDesligamento) {
		this.dataDesligamento = dataDesligamento;
	}

}
