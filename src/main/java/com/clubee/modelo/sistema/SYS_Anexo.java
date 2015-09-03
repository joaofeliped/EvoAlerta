package com.clubee.modelo.sistema;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.clubee.modelo.ativos.AST_EquipamentoVO;
import com.clubee.modelo.manutencoes.MNT_OcorrenciaVO;

@Entity
@Table(name = "SYS_Anexo")
public class SYS_Anexo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer requestID;

	@Lob
	@Column(name = "anexo_1")
	private byte[] anexo1;

	@Lob
	@Column(name = "anexo_2")
	private byte[] anexo2;

	@Lob
	@Column(name = "anexo_3")
	private byte[] anexo3;

	@Lob
	@Column(name = "anexo_4")
	private byte[] anexo4;

	@OneToOne
	@JoinColumn(name = "equipamento_id")
	private AST_EquipamentoVO equipamento;

	@OneToOne
	@JoinColumn(name = "ocorrencia_id")
	private MNT_OcorrenciaVO ocorrencia;

	public Integer getRequestID() {
		return requestID;
	}

	public void setRequestID(Integer requestID) {
		this.requestID = requestID;
	}

	public byte[] getAnexo1() {
		return anexo1;
	}

	public void setAnexo1(byte[] anexo1) {
		this.anexo1 = anexo1;
	}

	public byte[] getAnexo2() {
		return anexo2;
	}

	public void setAnexo2(byte[] anexo2) {
		this.anexo2 = anexo2;
	}

	public byte[] getAnexo3() {
		return anexo3;
	}

	public void setAnexo3(byte[] anexo3) {
		this.anexo3 = anexo3;
	}

	public byte[] getAnexo4() {
		return anexo4;
	}

	public void setAnexo4(byte[] anexo4) {
		this.anexo4 = anexo4;
	}

	public AST_EquipamentoVO getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(AST_EquipamentoVO equipamento) {
		this.equipamento = equipamento;
	}

	public MNT_OcorrenciaVO getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(MNT_OcorrenciaVO ocorrencia) {
		this.ocorrencia = ocorrencia;
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
		SYS_Anexo other = (SYS_Anexo) obj;
		if (requestID == null) {
			if (other.requestID != null)
				return false;
		} else if (!requestID.equals(other.requestID))
			return false;
		return true;
	}

}
