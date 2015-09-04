package com.clubee.dao.ativos;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.ativos.AST_CategoriaEquipamentoVO;
import com.clubee.modelo.ativos.AST_TipoEquipamentoVO;
import com.clubee.util.jpa.Transactional;

public class AST_CategoriaEquipamentoDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;

	public AST_CategoriaEquipamentoVO porID(Integer id) {
		return manager.find(AST_CategoriaEquipamentoVO.class, id);
	}
	
	@Transactional
	public void inserirCategoriaEquipamento(AST_CategoriaEquipamentoVO categoriaEquipamento) {
		manager.merge(categoriaEquipamento);
	}
	
	public List<AST_CategoriaEquipamentoVO> buscarTodasCategoriasEquipamento() {
		return manager.createQuery("from AST_CategoriaEquipamentoVO", AST_CategoriaEquipamentoVO.class)
				.getResultList();
	}
	
	public List<AST_TipoEquipamentoVO> buscarTiposPorCategoria(AST_CategoriaEquipamentoVO categoria) {
		categoria = porID(categoria.getRequestID());
		
		return manager.createQuery("select t from AST_TipoEquipamentoVO t where t.categoriaEquipamento = :categoria", AST_TipoEquipamentoVO.class)
				.setParameter("categoria", categoria)
				.getResultList();
	}

}





