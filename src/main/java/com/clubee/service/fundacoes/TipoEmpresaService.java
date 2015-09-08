package com.clubee.service.fundacoes;

import java.io.Serializable;

import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_TipoEmpresaDAO;
import com.clubee.modelo.fundacoes.FND_TipoEmpresaVO;
import com.clubee.util.jpa.Transactional;

public class TipoEmpresaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private FND_TipoEmpresaDAO tipoEmpresaDAO;

	@Transactional
	public void salvar(FND_TipoEmpresaVO tipoEmpresa) {
		tipoEmpresaDAO.inserirTipoEmpresa(tipoEmpresa);
	}
}
