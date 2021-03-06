package com.clubee.service.fundacoes;

import java.io.Serializable;

import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_PerfilDAO;
import com.clubee.modelo.fundacoes.FND_PerfilVO;
import com.clubee.util.jpa.Transactional;

public class PerfilService implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private FND_PerfilDAO perfilDAO;
	
	@Transactional
	public void salvar(FND_PerfilVO perfil) {
		perfilDAO.inserirPerfil(perfil);
	}
}
