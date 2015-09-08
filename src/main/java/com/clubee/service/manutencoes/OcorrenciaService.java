package com.clubee.service.manutencoes;

import javax.inject.Inject;

import com.clubee.dao.manutencoes.MNT_OcorrenciaDAO;
import com.clubee.modelo.manutencoes.MNT_OcorrenciaVO;
import com.clubee.util.jpa.Transactional;

public class OcorrenciaService {
	
	@Inject
	private MNT_OcorrenciaDAO ocorrenciaDAO;
	
	@Transactional
	public void salvar(MNT_OcorrenciaVO ocorrencia) {
		ocorrenciaDAO.inserirOcorrencia(ocorrencia);
	}

}
