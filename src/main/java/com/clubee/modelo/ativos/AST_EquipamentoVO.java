package com.clubee.modelo.ativos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.clubee.modelo.fundacoes.FND_AreaVO;
import com.clubee.modelo.manutencoes.MNT_OcorrenciaVO;
import com.clubee.modelo.rotinas.RTN_GestaoDeRotinaVO;
import com.clubee.modelo.sistema.SYS_Anexo;

@Entity
@Table(name = "AST_Equipamentos")
public class AST_EquipamentoVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Column(length = 180)
	private String nome;

	@Enumerated(EnumType.STRING)
	private StatusEquipamento status;

	@Column(name = "codigo_equipamento", length = 180)
	private String codigoEquipamento;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private AST_CategoriaEquipamentoVO categoria;

	@ManyToOne
	@JoinColumn(name = "tipo_id")
	private AST_TipoEquipamentoVO tipo;

	@ManyToOne
	@JoinColumn(name = "marca_id")
	private AST_MarcaVO marca;

	@ManyToOne
	@JoinColumn(name = "modelo_id")
	private AST_ModeloVO modelo;

	@ManyToOne
	@JoinColumn(name = "area_id")
	private FND_AreaVO area;

	@ManyToOne
	@JoinColumn(name = "fabricante_id")
	private AST_FabricanteVO fabricante;

	@Column(name = "numero_de_serie", length = 180)
	private String numeroDeSerie;

	@OneToOne
	@JoinColumn(name = "anexo_id")
	private SYS_Anexo anexo;

	@Embedded
	private DadosDataEquipamento dadosDeDatas;

	@Column(name = "periodicidade_quantidade")
	private Integer periodicidadeQuantidade;

	@Column(name = "periodicidade_parametro", length = 180)
	private String periodicidadeParametro;

	@Column(name = "valor_de_compra", precision = 10, scale = 2)
	private BigDecimal valorDeCompra;

	@OneToMany(mappedBy = "equipamento")
	private List<MNT_OcorrenciaVO> ocorrencias = new ArrayList<>();

	@OneToMany(mappedBy = "equipamento")
	private List<RTN_GestaoDeRotinaVO> gestoesDeRotinas = new ArrayList<>();

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

	public StatusEquipamento getStatus() {
		return status;
	}

	public void setStatus(StatusEquipamento status) {
		this.status = status;
	}

	public String getCodigoEquipamento() {
		return codigoEquipamento;
	}

	public void setCodigoEquipamento(String codigoEquipamento) {
		this.codigoEquipamento = codigoEquipamento;
	}

	public AST_CategoriaEquipamentoVO getCategoria() {
		return categoria;
	}

	public void setCategoria(AST_CategoriaEquipamentoVO categoria) {
		this.categoria = categoria;
	}

	public AST_TipoEquipamentoVO getTipo() {
		return tipo;
	}

	public void setTipo(AST_TipoEquipamentoVO tipo) {
		this.tipo = tipo;
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

	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}

	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}

	public SYS_Anexo getAnexo() {
		return anexo;
	}

	public void setAnexo(SYS_Anexo anexo) {
		this.anexo = anexo;
	}

	public DadosDataEquipamento getDadosDeDatas() {
		return dadosDeDatas;
	}

	public void setDadosDeDatas(DadosDataEquipamento dadosDeDatas) {
		this.dadosDeDatas = dadosDeDatas;
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

	public BigDecimal getValorDeCompra() {
		return valorDeCompra;
	}

	public void setValorDeCompra(BigDecimal valorDeCompra) {
		this.valorDeCompra = valorDeCompra;
	}

	public FND_AreaVO getArea() {
		return area;
	}

	public void setArea(FND_AreaVO area) {
		this.area = area;
	}

	public List<MNT_OcorrenciaVO> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(List<MNT_OcorrenciaVO> ocorrencias) {
		this.ocorrencias = ocorrencias;
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
		AST_EquipamentoVO other = (AST_EquipamentoVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}
}
