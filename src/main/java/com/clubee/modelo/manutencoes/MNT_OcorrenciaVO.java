package com.clubee.modelo.manutencoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.clubee.modelo.ativos.AST_EquipamentoVO;
import com.clubee.modelo.fundacoes.FND_Area;
import com.clubee.modelo.fundacoes.FND_EmpresaVO;
import com.clubee.modelo.fundacoes.FND_PessoaVO;
import com.clubee.modelo.sistema.SYS_Anexo;

@Entity
@Table(name = "MNT_Ocorrencia")
public class MNT_OcorrenciaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Column(length = 180)
	private String sumario;

	@Column(columnDefinition = "text")
	private String descricaoDetalhada;

	@ManyToOne
	@JoinColumn(name = "solicitante_id")
	private FND_PessoaVO solicitante;

	@Column(length = 180)
	private String categoria1;

	@Column(length = 180)
	private String categoria2;

	@Column(length = 180)
	private String categoria3;

	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private FND_EmpresaVO empresa;

	@ManyToOne
	@JoinColumn(name = "area_designada")
	private FND_Area areaDesignada;

	@ManyToOne
	@JoinColumn(name = "atendido_por")
	private FND_PessoaVO atendidoPor;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAbertura;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEsperada;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataConclusao;

	@Enumerated(EnumType.STRING)
	private StatusOcorrencia status;

	@Temporal(TemporalType.DATE)
	private Date reminder;

	@Column(columnDefinition = "text")
	private String reminderDescricao;

	@OneToOne
	@JoinColumn(name = "anexo")
	private SYS_Anexo anexo;

	@Column(columnDefinition = "text")
	private String conclusao;

	@Column(length = 180)
	private String causaRaiz;

	@ManyToOne
	@JoinColumn(name = "modificado_por")
	private FND_PessoaVO modificadoPor;

	@ManyToOne
	@JoinColumn(name = "equipamento")
	private AST_EquipamentoVO equipamento;

	@OneToMany(mappedBy = "ocorrencia")
	private List<MNT_TarefaVO> tarefas = new ArrayList<>();

	public Integer getRequestID() {
		return requestID;
	}

	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}

	public String getSumario() {
		return sumario;
	}

	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	public String getDescricaoDetalhada() {
		return descricaoDetalhada;
	}

	public void setDescricaoDetalhada(String descricaoDetalhada) {
		this.descricaoDetalhada = descricaoDetalhada;
	}

	public FND_PessoaVO getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(FND_PessoaVO solicitante) {
		this.solicitante = solicitante;
	}

	public String getCategoria1() {
		return categoria1;
	}

	public void setCategoria1(String categoria1) {
		this.categoria1 = categoria1;
	}

	public String getCategoria2() {
		return categoria2;
	}

	public void setCategoria2(String categoria2) {
		this.categoria2 = categoria2;
	}

	public String getCategoria3() {
		return categoria3;
	}

	public void setCategoria3(String categoria3) {
		this.categoria3 = categoria3;
	}

	public FND_EmpresaVO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(FND_EmpresaVO empresa) {
		this.empresa = empresa;
	}

	public FND_Area getAreaDesignada() {
		return areaDesignada;
	}

	public void setAreaDesignada(FND_Area areaDesignada) {
		this.areaDesignada = areaDesignada;
	}

	public FND_PessoaVO getAtendidoPor() {
		return atendidoPor;
	}

	public void setAtendidoPor(FND_PessoaVO atendidoPor) {
		this.atendidoPor = atendidoPor;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataEsperada() {
		return dataEsperada;
	}

	public void setDataEsperada(Date dataEsperada) {
		this.dataEsperada = dataEsperada;
	}

	public Date getDataConclusao() {
		return dataConclusao;
	}

	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}

	public StatusOcorrencia getStatus() {
		return status;
	}

	public void setStatus(StatusOcorrencia status) {
		this.status = status;
	}

	public Date getReminder() {
		return reminder;
	}

	public void setReminder(Date reminder) {
		this.reminder = reminder;
	}

	public String getReminderDescricao() {
		return reminderDescricao;
	}

	public void setReminderDescricao(String reminderDescricao) {
		this.reminderDescricao = reminderDescricao;
	}

	public SYS_Anexo getAnexo() {
		return anexo;
	}

	public void setAnexo(SYS_Anexo anexo) {
		this.anexo = anexo;
	}

	public String getConclusao() {
		return conclusao;
	}

	public void setConclusao(String conclusao) {
		this.conclusao = conclusao;
	}

	public String getCausaRaiz() {
		return causaRaiz;
	}

	public void setCausaRaiz(String causaRaiz) {
		this.causaRaiz = causaRaiz;
	}

	public FND_PessoaVO getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(FND_PessoaVO modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public AST_EquipamentoVO getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(AST_EquipamentoVO equipamento) {
		this.equipamento = equipamento;
	}

	public List<MNT_TarefaVO> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<MNT_TarefaVO> tarefas) {
		this.tarefas = tarefas;
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
		MNT_OcorrenciaVO other = (MNT_OcorrenciaVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}
}
