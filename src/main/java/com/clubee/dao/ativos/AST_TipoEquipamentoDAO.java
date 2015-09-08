package com.clubee.dao.ativos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.ativos.AST_TipoEquipamentoVO;

public class AST_TipoEquipamentoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public AST_TipoEquipamentoVO porID(Integer id) {
		return manager.find(AST_TipoEquipamentoVO.class, id);
	}
	
	public void inserirTipoEquipamentoVO(AST_TipoEquipamentoVO tipoEquipamento) {
		manager.merge(tipoEquipamento);
	}
	
	public List<AST_TipoEquipamentoVO> buscarTodosTiposEquipamentos() {
		return manager.createQuery("from AST_TipoEquipamentoVO", AST_TipoEquipamentoVO.class)
				.getResultList();
	}
	

}
