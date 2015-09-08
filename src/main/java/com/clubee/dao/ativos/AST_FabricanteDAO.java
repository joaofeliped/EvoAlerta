package com.clubee.dao.ativos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.ativos.AST_FabricanteVO;

public class AST_FabricanteDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public AST_FabricanteVO porID(Integer id) {
		return manager.find(AST_FabricanteVO.class, id);
	}
	
	public void inserirFabricante(AST_FabricanteVO fabricante) {
		manager.merge(fabricante);
	}
	
	public List<AST_FabricanteVO> buscarTodosFabricantes() {
		return manager.createQuery("from AST_FabricanteVO", AST_FabricanteVO.class)
				.getResultList();
	}

}
