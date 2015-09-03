package com.clubee.modelo.fundacoes;

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

import com.clubee.modelo.rotinas.RTN_RotinaVO;

@Entity
@Table(name = "FND_Designacoes")
public class FND_Designacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Column(length = 180)
	private String nome;

	@Column(columnDefinition = "text")
	private String detalhe;

	@Column(name = "categoria_1", length = 180)
	private String categoria1;

	@Column(name = "categoria_2", length = 180)
	private String categoria2;

	@Column(name = "categoria_3", length = 180)
	private String categoria3;

	@ManyToOne
	@JoinColumn(name = "empresa")
	private FND_EmpresaVO empresa;

	@ManyToOne
	@JoinColumn(name = "area")
	private FND_Area area;

	@OneToMany(mappedBy = "designacao")
	private List<RTN_RotinaVO> rotinas = new ArrayList<>();

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

	public String getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(String detalhe) {
		this.detalhe = detalhe;
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

	public FND_Area getArea() {
		return area;
	}

	public void setArea(FND_Area area) {
		this.area = area;
	}

	public List<RTN_RotinaVO> getRotinas() {
		return rotinas;
	}

	public void setRotinas(List<RTN_RotinaVO> rotinas) {
		this.rotinas = rotinas;
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
		FND_Designacao other = (FND_Designacao) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}

}
