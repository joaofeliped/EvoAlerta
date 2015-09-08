package com.clubee.service.fundacoes;

import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_CategoriaOperacionalDAO;
import com.clubee.modelo.fundacoes.FND_CategoriaOperacionalVO;
import com.clubee.util.jpa.Transactional;

public class CategoriaOperacionalService {
	
	@Inject
	private FND_CategoriaOperacionalDAO categoriaOperacionalDAO;
	
	@Transactional
	public void salvar(FND_CategoriaOperacionalVO categoriaOperacional) {
		categoriaOperacionalDAO.inserirCatOperacionalVO(categoriaOperacional);
	}
}
