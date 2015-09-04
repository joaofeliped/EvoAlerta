package com.clubee.dao.fundacoes;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.fundacoes.FND_AreaVO;
import com.clubee.util.jpa.Transactional;

public class FND_AreaDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public FND_AreaVO porID(Integer id) {
		return manager.find(FND_AreaVO.class, id);
	}
	
	@Transactional
	public void inserirArea(FND_AreaVO area) {
		manager.merge(area);
	}
	
	public List<FND_AreaVO> buscarTodasAreas() {
		return manager.createQuery("from FND_AreaVO", FND_AreaVO.class)
				.getResultList();
	}

}
