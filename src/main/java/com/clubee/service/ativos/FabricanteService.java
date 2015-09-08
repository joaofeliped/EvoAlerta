package com.clubee.service.ativos;

import java.io.Serializable;

import javax.inject.Inject;

import com.clubee.dao.ativos.AST_FabricanteDAO;
import com.clubee.modelo.ativos.AST_FabricanteVO;
import com.clubee.util.jpa.Transactional;

public class FabricanteService implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private AST_FabricanteDAO fabricanteDAO;
	
	@Transactional
	public void salvar(AST_FabricanteVO fabricante) {
		fabricanteDAO.inserirFabricante(fabricante);
	}
}
