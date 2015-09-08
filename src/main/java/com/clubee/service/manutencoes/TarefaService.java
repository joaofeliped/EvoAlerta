package com.clubee.service.manutencoes;

import javax.inject.Inject;

import com.clubee.dao.manutencoes.MNT_TarefaDAO;
import com.clubee.modelo.manutencoes.MNT_TarefaVO;
import com.clubee.util.jpa.Transactional;

public class TarefaService {
	
	@Inject
	private MNT_TarefaDAO tarefaDAO;
	
	@Transactional
	public void salvar(MNT_TarefaVO tarefa) {
		tarefaDAO.inserirTarefa(tarefa);
	}
}
