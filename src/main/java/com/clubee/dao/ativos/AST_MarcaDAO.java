package com.clubee.dao.ativos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.ativos.AST_MarcaVO;
import com.clubee.util.jpa.Transactional;

public class AST_MarcaDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public AST_MarcaVO porID(Integer id) {
		return manager.find(AST_MarcaVO.class, id);
	}
	
	@Transactional
	public void inserirMarcar(AST_MarcaVO marca) {
		manager.merge(marca);
	}
	
	public List<AST_MarcaVO> buscarTodasMarcas() {
		return manager.createQuery("from AST_MarcaVO", AST_MarcaVO.class)
				.getResultList();
	}

}
