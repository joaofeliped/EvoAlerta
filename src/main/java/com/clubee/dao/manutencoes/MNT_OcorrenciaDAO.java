package com.clubee.dao.manutencoes;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.manutencoes.MNT_OcorrenciaVO;
import com.clubee.util.jpa.Transactional;

public class MNT_OcorrenciaDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public MNT_OcorrenciaVO porID(Integer id) {
		return manager.find(MNT_OcorrenciaVO.class, id);
	}
	
	@Transactional
	public void inserirOcorrencia(MNT_OcorrenciaVO ocorrencia) {
		manager.merge(ocorrencia);
	}
	
	public List<MNT_OcorrenciaVO> buscarTodasOcorrencias() {
		return manager.createQuery("from MNT_OcorrenciaVO", MNT_OcorrenciaVO.class)
				.getResultList();
	}

}
