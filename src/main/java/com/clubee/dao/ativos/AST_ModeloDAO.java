package com.clubee.dao.ativos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.ativos.AST_ModeloVO;
import com.clubee.util.jpa.Transactional;

public class AST_ModeloDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public AST_ModeloVO porID(Integer id) {
		return manager.find(AST_ModeloVO.class, id);
	}
	
	@Transactional
	public void inserirModelo(AST_ModeloVO modelo) {
		manager.merge(modelo);
	}
	
	public List<AST_ModeloVO> buscarTodosModelos() {
		return manager.createQuery("from AST_ModeloVO", AST_ModeloVO.class)
				.getResultList();
	}

}
