package com.clubee.service.fundacoes;

import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_TipoEmpresaDAO;
import com.clubee.modelo.fundacoes.FND_TipoEmpresaVO;
import com.clubee.util.jpa.Transactional;

public class TipoEmpresaService {
	
	@Inject
	private FND_TipoEmpresaDAO tipoEmpresaDAO;
	
	@Transactional
	public void salvar(FND_TipoEmpresaVO tipoEmpresa) {
		tipoEmpresaDAO.inserirTipoEmpresa(tipoEmpresa);
	}
}
