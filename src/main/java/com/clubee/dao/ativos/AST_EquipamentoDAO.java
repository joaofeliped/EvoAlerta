package com.clubee.dao.ativos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.ativos.AST_EquipamentoVO;

public class AST_EquipamentoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public AST_EquipamentoVO porID(Integer id) {
		return manager.find(AST_EquipamentoVO.class, id);
	}
	
	public void inserirEquipamentoVO(AST_EquipamentoVO equipamento) {
		manager.merge(equipamento);
	}
	
	public List<AST_EquipamentoVO> buscarTodosEquipamentos() {
		return manager.createQuery("from AST_EquipamentoVO", AST_EquipamentoVO.class)
				.getResultList();
	}

}
