package com.clubee.dao.fundacoes;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.fundacoes.FND_PerfilVO;
import com.clubee.util.jpa.Transactional;

public class FND_PerfilDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public FND_PerfilVO porID(Integer id) {
		return manager.find(FND_PerfilVO.class, id);
	}
	
	@Transactional
	public void inserirPerfil(FND_PerfilVO perfil) {
		manager.merge(perfil);
	}
	
	public List<FND_PerfilVO> buscarTodosPerfils() {
		return manager.createQuery("from FND_PerfilVO", FND_PerfilVO.class)
				.getResultList();
	}

}
