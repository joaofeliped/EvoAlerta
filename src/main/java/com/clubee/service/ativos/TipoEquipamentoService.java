package com.clubee.service.ativos;

import javax.inject.Inject;

import com.clubee.dao.ativos.AST_TipoEquipamentoDAO;
import com.clubee.modelo.ativos.AST_TipoEquipamentoVO;
import com.clubee.util.jpa.Transactional;

public class TipoEquipamentoService {
	
	@Inject
	private AST_TipoEquipamentoDAO tipoEquipamentoDAO;
	
	@Transactional
	public void salvar(AST_TipoEquipamentoVO tipoEquipamento) {
		tipoEquipamentoDAO.inserirTipoEquipamentoVO(tipoEquipamento);
	}
}
