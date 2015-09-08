package com.clubee.service.fundacoes;

import java.io.Serializable;

import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_AreaDAO;
import com.clubee.modelo.fundacoes.FND_AreaVO;
import com.clubee.util.jpa.Transactional;

public class AreaService implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private FND_AreaDAO areaDAO;
	
	@Transactional
	public void salvar(FND_AreaVO area) {
		areaDAO.inserirArea(area);
	}
}
