package com.clubee.modelo.ativos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.clubee.modelo.fundacoes.FND_PessoaVO;

@Entity
@Table(name = "AST_Fabricante")
public class AST_FabricanteVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Column(length = 180)
	private String nome;

	@Temporal(TemporalType.DATE)
	private Date dataDeCriacao;

	@ManyToOne
	@JoinColumn(name = "criado_por")
	private FND_PessoaVO criadoPor;

	@OneToMany(mappedBy = "fabricante")
	private List<AST_EquipamentoVO> equipamentos = new ArrayList<>();

	@OneToMany(mappedBy = "fabricante")
	private List<AST_ModeloVO> modelos = new ArrayList<>();

	@OneToMany(mappedBy = "fabricante")
	private List<AST_MarcaVO> marcas = new ArrayList<>();

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

	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public FND_PessoaVO getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(FND_PessoaVO criadoPor) {
		this.criadoPor = criadoPor;
	}

	public List<AST_EquipamentoVO> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<AST_EquipamentoVO> equipamentos) {
		this.equipamentos = equipamentos;
	}

	public List<AST_ModeloVO> getModelos() {
		return modelos;
	}

	public void setModelos(List<AST_ModeloVO> modelos) {
		this.modelos = modelos;
	}

	public List<AST_MarcaVO> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<AST_MarcaVO> marcas) {
		this.marcas = marcas;
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
		AST_FabricanteVO other = (AST_FabricanteVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}
}
