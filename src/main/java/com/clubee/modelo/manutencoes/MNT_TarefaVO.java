package com.clubee.modelo.manutencoes;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.clubee.modelo.fundacoes.FND_AreaVO;
import com.clubee.modelo.fundacoes.FND_PessoaVO;

@Entity
@Table(name = "MNT_Tarefas")
public class MNT_TarefaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Column(length = 180)
	private String nome;

	@Column(columnDefinition = "text")
	private String sumario;

	@Column(columnDefinition = "text")
	private String descricao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_execucao")
	private Date dataExecucao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_conclusao")
	private Date dataConclusao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_abertura")
	private Date dataAbertura;

	@ManyToOne
	@JoinColumn(name = "aberto_por")
	private FND_PessoaVO abertoPor;

	@ManyToOne
	@JoinColumn(name = "area_designada")
	private FND_AreaVO areaDesignada;

	@ManyToOne
	@JoinColumn(name = "ocorrencia")
	private MNT_OcorrenciaVO ocorrencia;

	@Enumerated(EnumType.STRING)
	private StatusTarefa status;

	public Integer getRequestID() {
		return requestID;
	}

	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSumario() {
		return sumario;
	}

	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(Date dataExecucao) {
		this.dataExecucao = dataExecucao;
	}

	public Date getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public FND_PessoaVO getAbertoPor() {
		return abertoPor;
	}

	public void setAbertoPor(FND_PessoaVO abertoPor) {
		this.abertoPor = abertoPor;
	}

	public FND_AreaVO getAreaDesignada() {
		return areaDesignada;
	}

	public void setAreaDesignada(FND_AreaVO areaDesignada) {
		this.areaDesignada = areaDesignada;
	}

	public MNT_OcorrenciaVO getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(MNT_OcorrenciaVO ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public StatusTarefa getStatus() {
		return status;
	}

	public void setStatus(StatusTarefa status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((requestID == null) ? 0 : requestID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MNT_TarefaVO other = (MNT_TarefaVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}
}
