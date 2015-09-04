package com.clubee.dao.rotinas;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.rotinas.RTN_RotinaVO;
import com.clubee.util.jpa.Transactional;

public class RTN_RotinaDAO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public RTN_RotinaVO porId(Integer id) {
		return manager.find(RTN_RotinaVO.class, id);
	}

	@Transactional
	public void inserirRotina(RTN_RotinaVO rotina) {
		manager.merge(rotina);
	}

	public List<RTN_RotinaVO> porStatus(String status) {
		return manager.createQuery("select tp from RTN_RotinaVO tp where tp.status = :status ", RTN_RotinaVO.class)
				.getResultList();
	}

	public List<RTN_RotinaVO> todasRotinas() {
		return manager.createQuery("from RTN_RotinaVO", RTN_RotinaVO.class)
				.getResultList();
	}

}
