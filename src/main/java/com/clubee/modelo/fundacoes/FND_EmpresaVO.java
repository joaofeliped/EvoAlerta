package com.clubee.modelo.fundacoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.clubee.modelo.manutencoes.MNT_OcorrenciaVO;

@Entity
@Table(name = "FND_Empresas")
public class FND_EmpresaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Column(name = "nome_empresa", length = 150)
	private String nomeEmpresa;

	@Column(length = 20)
	private String cnpj;

	@Column(length = 100, unique = true)
	private String email;

	private String password;

	@Embedded
	private Localizacao localizacao;

	@Embedded
	private Endereco endereco;

	@OneToMany(mappedBy = "empresa")
	private List<FND_PessoaVO> pessoas = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "relacao_empresa_tipo_empresa", joinColumns = @JoinColumn(name = "empresa_id") , inverseJoinColumns = @JoinColumn(name = "tipo_id") )
	private List<FND_TipoEmpresaVO> tiposEmpresa = new ArrayList<>();

	@OneToMany(mappedBy = "empresa")
	private List<FND_CategoriaOperacionalVO> categoriasOperacionais = new ArrayList<>();
	
	@ManyToMany
	@JoinTable(name = "relacao_empresa_area", joinColumns = @JoinColumn(name = "empresa_id"),
			inverseJoinColumns = @JoinColumn(name = "area_id"))
	private List<FND_Area> areas = new ArrayList<>();
	
	@OneToMany(mappedBy = "empresa")
	private List<MNT_OcorrenciaVO> ocorrencias = new ArrayList<>();

	public Integer getRequestID() {
		return requestID;
	}

	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<FND_PessoaVO> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<FND_PessoaVO> pessoas) {
		this.pessoas = pessoas;
	}

	public List<FND_TipoEmpresaVO> getTiposEmpresa() {
		return tiposEmpresa;
	}

	public void setTiposEmpresa(List<FND_TipoEmpresaVO> tiposEmpresa) {
		this.tiposEmpresa = tiposEmpresa;
	}

	public List<FND_CategoriaOperacionalVO> getCategoriasOperacionais() {
		return categoriasOperacionais;
	}

	public void setCategoriasOperacionais(List<FND_CategoriaOperacionalVO> categoriasOperacionais) {
		this.categoriasOperacionais = categoriasOperacionais;
	}
	
	public List<FND_Area> getAreas() {
		return areas;
	}

	public void setAreas(List<FND_Area> areas) {
		this.areas = areas;
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
		FND_EmpresaVO other = (FND_EmpresaVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}
}
