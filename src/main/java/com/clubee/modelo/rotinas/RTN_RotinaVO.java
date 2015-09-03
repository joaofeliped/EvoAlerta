package com.clubee.modelo.rotinas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.clubee.modelo.fundacoes.FND_Designacao;
import com.clubee.modelo.fundacoes.FND_PessoaVO;

@Entity
@Table(name = "RTN_Rotinas")
public class RTN_RotinaVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Enumerated(EnumType.STRING)
	private TipoRotina tipo;

	@Enumerated(EnumType.STRING)
	private StatusRotina status;

	@ManyToOne
	@JoinColumn(name = "criado_por")
	private FND_PessoaVO criadoPor;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;

	@ManyToOne
	@JoinColumn(name = "designacao_id")
	private FND_Designacao designacao;

	@OneToMany(mappedBy = "rotina")
	private List<RTN_GestaoDeRotinaVO> gestoesDeRotinas = new ArrayList<>();

	public Integer getRequestID() {
		return requestID;
	}

	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}

	public TipoRotina getTipo() {
		return tipo;
	}

	public void setTipo(TipoRotina tipo) {
		this.tipo = tipo;
	}

	public StatusRotina getStatus() {
		return status;
	}

	public void setStatus(StatusRotina status) {
		this.status = status;
	}

	public FND_PessoaVO getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(FND_PessoaVO criadoPor) {
		this.criadoPor = criadoPor;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public FND_Designacao getDesignacao() {
		return designacao;
	}

	public void setDesignacao(FND_Designacao designacao) {
		this.designacao = designacao;
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
		RTN_RotinaVO other = (RTN_RotinaVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}

}
