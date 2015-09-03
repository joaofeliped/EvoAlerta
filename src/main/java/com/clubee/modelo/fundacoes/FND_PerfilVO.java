package com.clubee.modelo.fundacoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.clubee.modelo.sistema.SYS_Modulo;

@Entity
@Table(name = "FND_Perfils")
public class FND_PerfilVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@OneToOne(mappedBy = "perfil")
	private FND_PessoaVO pessoa;

	@Enumerated(EnumType.STRING)
	private StatusPerfil status;

	@ManyToMany(mappedBy = "perfis")
	private List<SYS_Modulo> modulos = new ArrayList<>();

	public Integer getRequestID() {
		return requestID;
	}

	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}

	public FND_PessoaVO getPessoa() {
		return pessoa;
	}

	public void setPessoa(FND_PessoaVO pessoa) {
		this.pessoa = pessoa;
	}

	public StatusPerfil getStatus() {
		return status;
	}

	public void setStatus(StatusPerfil status) {
		this.status = status;
	}

	public List<SYS_Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<SYS_Modulo> modulos) {
		this.modulos = modulos;
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
		FND_PerfilVO other = (FND_PerfilVO) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}

}
