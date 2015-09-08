package com.clubee.service.ativos;

import javax.inject.Inject;

import com.clubee.dao.ativos.AST_FabricanteDAO;
import com.clubee.modelo.ativos.AST_FabricanteVO;
import com.clubee.util.jpa.Transactional;

public class FabricanteService {
	
	@Inject
	private AST_FabricanteDAO fabricanteDAO;
	
	@Transactional
	public void salvar(AST_FabricanteVO fabricante) {
		fabricanteDAO.inserirFabricante(fabricante);
	}
}
