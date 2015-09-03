package com.clubee.modelo.ativos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="AST_Modelos")
public class AST_ModeloVO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer requestID;
	
	@Column(length = 180)
	private String nome;
	
	@Column(columnDefinition = "text")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "marca_id")
	private AST_MarcaVO marca;
	
	@ManyToOne
	@JoinColumn(name = "modelo_id")
	private AST_ModeloVO modelo;
	
	@ManyToOne
	@JoinColumn(name = "fabricante_id")
	private AST_FabricanteVO fabricante;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public AST_MarcaVO getMarca() {
		return marca;
	}

	public void setMarca(AST_MarcaVO marca) {
		this.marca = marca;
	}

	public AST_ModeloVO getModelo() {
		return modelo;
	}

	public void setModelo(AST_ModeloVO modelo) {
		this.modelo = modelo;
	}

	public AST_FabricanteVO getFabricante() {
		return fabricante;
	}

	public void setFabricante(AST_FabricanteVO fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((requestID == null) ? 0 : requestID.hashCode());
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
		AST_ModeloVO other = (AST_ModeloVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}
}
