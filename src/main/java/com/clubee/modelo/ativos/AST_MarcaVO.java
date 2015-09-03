package com.clubee.modelo.ativos;

import java.io.Serializable;
import java.util.ArrayList;
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

@Entity
@Table(name = "AST_Marca")
public class AST_MarcaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Column(length = 180)
	private String nome;

	@ManyToOne
	@JoinColumn(name = "fabricante_id")
	private AST_FabricanteVO fabricante;

	@OneToMany(mappedBy = "marca")
	private List<AST_ModeloVO> modelos = new ArrayList<>();

	@OneToMany(mappedBy = "marca")
	private List<AST_EquipamentoVO> equipamentos = new ArrayList<>();

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

	public AST_FabricanteVO getFabricante() {
		return fabricante;
	}

	public void setFabricante(AST_FabricanteVO fabricante) {
		this.fabricante = fabricante;
	}

	public List<AST_ModeloVO> getModelos() {
		return modelos;
	}

	public void setModelos(List<AST_ModeloVO> modelos) {
		this.modelos = modelos;
	}

	public List<AST_EquipamentoVO> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<AST_EquipamentoVO> equipamentos) {
		this.equipamentos = equipamentos;
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
		AST_MarcaVO other = (AST_MarcaVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}

}
