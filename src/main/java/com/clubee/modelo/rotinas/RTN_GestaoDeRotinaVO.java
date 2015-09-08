package com.clubee.modelo.rotinas;

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

import com.clubee.modelo.ativos.AST_EquipamentoVO;
import com.clubee.modelo.fundacoes.FND_AreaVO;
import com.clubee.modelo.fundacoes.FND_PessoaVO;
import com.clubee.modelo.manutencoes.MNT_OcorrenciaVO;

@Entity
@Table(name = "RTN_Gestao_De_Rotinas")
public class RTN_GestaoDeRotinaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Column(name = "nome_atividade", length = 180)
	private String nomeAtividade;

	@Column(columnDefinition = "text")
	private String descricao;

	@ManyToOne
	@JoinColumn(name = "area_responsavel_id")
	private FND_AreaVO areaResponsavel;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicioRotina;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFimRotina;

	@ManyToOne
	@JoinColumn(name = "responsavel_id")
	private FND_PessoaVO responsavel;

	@Column(name = "periodicidade_quantidade")
	private Integer periodicidadeQuantidade;

	@Column(name = "periodicidade_parametro", length = 180)
	private String periodicidadeParametro;

	@ManyToOne
	@JoinColumn(name = "equipamento_id")
	private AST_EquipamentoVO equipamento;

	@ManyToOne
	@JoinColumn(name = "criado_por")
	private FND_PessoaVO criadoPor;

	@ManyToOne
	@JoinColumn(name = "ocorrencia_id")
	private MNT_OcorrenciaVO ocorrencia;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_de_rotina")
	private TipoRotina tipoRotina;

	@Enumerated(EnumType.STRING)
	private StatusRotina status;

	public Integer getRequestID() {
		return requestID;
	}

	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}

	public String getNomeAtividade() {
		return nomeAtividade;
	}

	public void setNomeAtividade(String nomeAtividade) {
		this.nomeAtividade = nomeAtividade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public FND_AreaVO getAreaResponsavel() {
		return areaResponsavel;
	}

	public void setAreaResponsavel(FND_AreaVO areaResponsavel) {
		this.areaResponsavel = areaResponsavel;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataInicioRotina() {
		return dataInicioRotina;
	}

	public void setDataInicioRotina(Date dataInicioRotina) {
		this.dataInicioRotina = dataInicioRotina;
	}

	public Date getDataFimRotina() {
		return dataFimRotina;
	}

	public void setDataFimRotina(Date dataFimRotina) {
		this.dataFimRotina = dataFimRotina;
	}

	public FND_PessoaVO getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(FND_PessoaVO responsavel) {
		this.responsavel = responsavel;
	}

	public Integer getPeriodicidadeQuantidade() {
		return periodicidadeQuantidade;
	}

	public void setPeriodicidadeQuantidade(Integer periodicidadeQuantidade) {
		this.periodicidadeQuantidade = periodicidadeQuantidade;
	}

	public String getPeriodicidadeParametro() {
		return periodicidadeParametro;
	}

	public void setPeriodicidadeParametro(String periodicidadeParametro) {
		this.periodicidadeParametro = periodicidadeParametro;
	}

	public AST_EquipamentoVO getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(AST_EquipamentoVO equipamento) {
		this.equipamento = equipamento;
	}

	public FND_PessoaVO getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(FND_PessoaVO criadoPor) {
		this.criadoPor = criadoPor;
	}

	public MNT_OcorrenciaVO getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(MNT_OcorrenciaVO ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public TipoRotina getTipoRotina() {
		return tipoRotina;
	}

	public void setTipoRotina(TipoRotina tipoRotina) {
		this.tipoRotina = tipoRotina;
	}

	public StatusRotina getStatus() {
		return status;
	}

	public void setStatus(StatusRotina status) {
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
		RTN_GestaoDeRotinaVO other = (RTN_GestaoDeRotinaVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}

}
