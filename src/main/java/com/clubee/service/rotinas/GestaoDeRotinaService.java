package com.clubee.service.rotinas;

import javax.inject.Inject;

import com.clubee.dao.rotinas.RTN_GestaoDeRotinaDAO;
import com.clubee.modelo.rotinas.RTN_GestaoDeRotinaVO;
import com.clubee.util.jpa.Transactional;

public class GestaoDeRotinaService {
	
	@Inject
	private RTN_GestaoDeRotinaDAO gestaoDeRotinaDAO;
	
	@Transactional
	public void salvar(RTN_GestaoDeRotinaVO gestaoDeRotina) {
		gestaoDeRotinaDAO.inserirGestaoDeRotinaVO(gestaoDeRotina);
	}

}
