package com.clubee.modelo.fundacoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.clubee.modelo.manutencoes.MNT_OcorrenciaVO;
import com.clubee.modelo.manutencoes.MNT_TarefaVO;
import com.clubee.modelo.rotinas.RTN_GestaoDeRotinaVO;
import com.clubee.modelo.rotinas.RTN_RotinaVO;

@Entity
@Table(name = "FND_Pessoas")
public class FND_PessoaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Column(name = "nome_completo", length = 180)
	private String nomeCompleto;

	@Column(length = 80)
	private String telefone;

	@Column(length = 14)
	private String cpf;

	@Column(length = 10)
	private String rg;

	@Embedded
	private Localizacao localizacao;

	@Embedded
	private Endereco endereco;

	@Column(length = 80, unique = true)
	private String email;

	@Column(length = 20)
	private String password;

	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private Sexo sexo;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_de_nascimento", length = 12)
	private Date dataDeNascimento;

	@Column(length = 40)
	private String nacionalidade;

	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private FND_EmpresaVO empresa;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_de_cadastro", length = 25)
	private Date dataDeCadastro;

	@Column(length = 80)
	private String matricula;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_pessoa", length = 40)
	private TipoPessoa tipoPessoa;

	@OneToOne
	@JoinColumn(name = "perfil_id")
	private FND_PerfilVO perfil;

	@ManyToMany
	@JoinTable(name = "relacao_pessoa_area", joinColumns = @JoinColumn(name = "pessoa_id") , inverseJoinColumns = @JoinColumn(name = "area_id") )
	private List<FND_AreaVO> areas = new ArrayList<>();

	@OneToMany(mappedBy = "solicitante")
	private List<MNT_OcorrenciaVO> ocorrencias = new ArrayList<>();

	@OneToMany(mappedBy = "abertoPor")
	private List<MNT_TarefaVO> tarefas = new ArrayList<>();

	@OneToMany(mappedBy = "criadoPor")
	private List<RTN_RotinaVO> rotinas = new ArrayList<>();

	@OneToMany(mappedBy = "criadoPor")
	private List<RTN_GestaoDeRotinaVO> gestoesDeRotinas = new ArrayList<>();

	public Integer getRequestID() {
		return requestID;
	}

	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public FND_EmpresaVO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(FND_EmpresaVO empresa) {
		this.empresa = empresa;
	}

	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public FND_PerfilVO getPerfil() {
		return perfil;
	}

	public void setPerfil(FND_PerfilVO perfil) {
		this.perfil = perfil;
	}

	public List<FND_AreaVO> getAreas() {
		return areas;
	}

	public void setAreas(List<FND_AreaVO> areas) {
		this.areas = areas;
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

	public List<RTN_RotinaVO> getRotinas() {
		return rotinas;
	}

	public void setRotinas(List<RTN_RotinaVO> rotinas) {
		this.rotinas = rotinas;
	}

	public List<RTN_GestaoDeRotinaVO> getGestoesDeRotinas() {
		return gestoesDeRotinas;
	}

	public void setGestoesDeRotinas(List<RTN_GestaoDeRotinaVO> gestoesDeRotinas) {
		this.gestoesDeRotinas = gestoesDeRotinas;
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
		FND_PessoaVO other = (FND_PessoaVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}

}
