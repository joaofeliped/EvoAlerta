package com.clubee.dao.manutencoes;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.manutencoes.MNT_TarefaVO;

public class MNT_TarefaDAO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	public MNT_TarefaVO porID(Integer id) {
		return manager.find(MNT_TarefaVO.class, id);
	}
	
	public void inserirTarefa(MNT_TarefaVO tarefa) {
		manager.merge(tarefa);
	}
	
	public List<MNT_TarefaVO> buscarTodasTarefas() {
		return manager.createQuery("from MNT_TarefaVO", MNT_TarefaVO.class)
				.getResultList();
	}

}
