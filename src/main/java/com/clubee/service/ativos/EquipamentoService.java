package com.clubee.service.ativos;

import javax.inject.Inject;

import com.clubee.dao.ativos.AST_EquipamentoDAO;
import com.clubee.modelo.ativos.AST_EquipamentoVO;
import com.clubee.util.jpa.Transactional;

public class EquipamentoService {
	
	@Inject
	private AST_EquipamentoDAO equipamentoDAO;
	
	@Transactional
	public void salvar(AST_EquipamentoVO equipamento) {
		equipamentoDAO.inserirEquipamentoVO(equipamento);
	}
}
