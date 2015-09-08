package com.clubee.service.ativos;

import java.io.Serializable;

import javax.inject.Inject;

import com.clubee.dao.ativos.AST_MarcaDAO;
import com.clubee.modelo.ativos.AST_MarcaVO;
import com.clubee.util.jpa.Transactional;

public class MarcaService implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private AST_MarcaDAO marcaDAO;
	
	@Transactional
	public void salvar(AST_MarcaVO marca) {
		marcaDAO.inserirMarcar(marca);
	}
}
