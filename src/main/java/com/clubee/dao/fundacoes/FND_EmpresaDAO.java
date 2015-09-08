package com.clubee.dao.fundacoes;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.fundacoes.FND_EmpresaVO;

public class FND_EmpresaDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public FND_EmpresaVO porID(Integer id) {
		return manager.find(FND_EmpresaVO.class, id);
	}
	
	public void inserirEmpresa(FND_EmpresaVO empresa) {
		manager.merge(empresa);
	}
	
	public List<FND_EmpresaVO> buscarTodasEmpresas() {
		return manager.createQuery("from FND_EmpresaVO", FND_EmpresaVO.class).getResultList();
	}

}
