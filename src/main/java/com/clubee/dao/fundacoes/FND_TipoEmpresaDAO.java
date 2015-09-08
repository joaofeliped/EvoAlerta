package com.clubee.dao.fundacoes;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.fundacoes.FND_TipoEmpresaVO;

public class FND_TipoEmpresaDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public FND_TipoEmpresaVO porID(Integer id) {
		return manager.find(FND_TipoEmpresaVO.class, id);
	}
	
	public void inserirTipoEmpresa(FND_TipoEmpresaVO tipoEmpresa) {
		manager.merge(tipoEmpresa);
	}
	
	public List<FND_TipoEmpresaVO> buscarTodosTiposEmpresa() {
		return manager.createQuery("from FND_TipoEmpresaVO", FND_TipoEmpresaVO.class)
				.getResultList();
	}

}
