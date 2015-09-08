package com.clubee.service.ativos;

import javax.inject.Inject;

import com.clubee.dao.ativos.AST_CategoriaEquipamentoDAO;
import com.clubee.modelo.ativos.AST_CategoriaEquipamentoVO;
import com.clubee.util.jpa.Transactional;

public class CategoriaEquipamentoService {
	
	@Inject
	private AST_CategoriaEquipamentoDAO categoriaEquipamentoDAO;
	
	@Transactional
	public void salvar(AST_CategoriaEquipamentoVO categoriaEquipamento) {
		categoriaEquipamentoDAO.inserirCategoriaEquipamento(categoriaEquipamento);
	}
}
