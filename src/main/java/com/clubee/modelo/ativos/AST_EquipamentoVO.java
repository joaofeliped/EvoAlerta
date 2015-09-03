package com.clubee.modelo.ativos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.clubee.modelo.fundacoes.FND_Area;

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
	@Column(length = 30)
	private StatusEquipamento status;

	@Column(length = 180)
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
	private FND_Area area;

	@ManyToOne
	@JoinColumn(name = "fabricante_id")
	private AST_FabricanteVO fabricante;

	@Column(length = 180)
	private String numeroDeSerie;

	@Lob
	private byte[] imagem;

	@Embedded
	private DadosDataEquipamento dadosDeDatas = new DadosDataEquipamento();

	private Integer periodicidadeQuantidade;

	@Column(length = 180)
	private String periodicidadeParametro;

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

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
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

	public FND_Area getArea() {
		return area;
	}

	public void setArea(FND_Area area) {
		this.area = area;
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
