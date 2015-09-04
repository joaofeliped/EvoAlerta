package com.clubee.dao.fundacoes;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.fundacoes.FND_DesignacaoVO;
import com.clubee.util.jpa.Transactional;

public class FND_DesignacaoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public FND_DesignacaoVO porID(Integer id) {
		return manager.find(FND_DesignacaoVO.class, id);
	}
	
	@Transactional
	public void inserirDesignacao(FND_DesignacaoVO designacao) {
		manager.merge(designacao);
	}
	
	public List<FND_DesignacaoVO> buscarTodasDesignacoes() {
		return manager.createQuery("from FND_DesignacaoVO", FND_DesignacaoVO.class)
				.getResultList();
	}

}
