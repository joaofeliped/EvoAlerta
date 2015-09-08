package com.clubee.modelo.fundacoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.clubee.modelo.manutencoes.MNT_OcorrenciaVO;
import com.clubee.modelo.manutencoes.MNT_TarefaVO;

@Entity
@Table(name = "FND_Areas")
public class FND_AreaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Column(length = 180)
	private String nome;

	@ManyToMany(mappedBy = "areas")
	private List<FND_PessoaVO> pessoas = new ArrayList<>();

	@ManyToMany(mappedBy = "areas")
	private List<FND_EmpresaVO> empresas = new ArrayList<>();

	@OneToMany(mappedBy = "areaDesignada")
	private List<MNT_OcorrenciaVO> ocorrencias = new ArrayList<>();

	@OneToMany(mappedBy = "areaDesignada")
	private List<MNT_TarefaVO> tarefas = new ArrayList<>();

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

	public List<FND_PessoaVO> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<FND_PessoaVO> pessoas) {
		this.pessoas = pessoas;
	}

	public List<FND_EmpresaVO> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<FND_EmpresaVO> empresas) {
		this.empresas = empresas;
	}

	public List<MNT_OcorrenciaVO> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(List<MNT_OcorrenciaVO> ocorrencias) {
		this.ocorrencias = ocorrencias;
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
		FND_AreaVO other = (FND_AreaVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}

}
