package com.clubee.service.ativos;

import javax.inject.Inject;

import com.clubee.dao.ativos.AST_ModeloDAO;
import com.clubee.modelo.ativos.AST_ModeloVO;
import com.clubee.util.jpa.Transactional;

public class ModeloService {
	
	@Inject
	private AST_ModeloDAO modeloDAO;
	
	@Transactional
	public void salvar(AST_ModeloVO modelo) {
		modeloDAO.inserirModelo(modelo);
	}
}
