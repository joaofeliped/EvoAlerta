package com.clubee.service.fundacoes;

import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_EmpresaDAO;
import com.clubee.modelo.fundacoes.FND_EmpresaVO;
import com.clubee.util.jpa.Transactional;

public class EmpresaService {
	
	@Inject
	private FND_EmpresaDAO empresaDAO;
	
	@Transactional
	public void salvar(FND_EmpresaVO empresa) {
		empresaDAO.inserirEmpresa(empresa);
	}
}
