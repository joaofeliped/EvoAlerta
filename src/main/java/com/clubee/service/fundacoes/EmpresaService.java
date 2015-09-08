package com.clubee.service.fundacoes;

import java.io.Serializable;

import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_EmpresaDAO;
import com.clubee.modelo.fundacoes.FND_EmpresaVO;
import com.clubee.util.jpa.Transactional;

public class EmpresaService implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private FND_EmpresaDAO empresaDAO;
	
	@Transactional
	public void salvar(FND_EmpresaVO empresa) {
		empresaDAO.inserirEmpresa(empresa);
	}
}
