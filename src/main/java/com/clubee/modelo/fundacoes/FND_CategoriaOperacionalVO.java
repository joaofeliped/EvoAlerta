package com.clubee.modelo.fundacoes;

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
@Table(name = "FND_Categoria_Operacional")
public class FND_CategoriaOperacionalVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int requestID;

	@Column(name = "categoria_1", length = 180)
	private String categoria1;

	@Column(name = "categoria_2", length = 180)
	private String categoria2;

	@Column(name = "categoria_3", length = 180)
	private String categoria3;

	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private FND_EmpresaVO empresa;

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
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
}
