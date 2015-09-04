package com.clubee.dao.rotinas;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.clubee.modelo.rotinas.RTN_GestaoDeRotinaVO;
import com.clubee.util.jpa.Transactional;

public class RTN_GestaoDeRotinaDAO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager; 
	
	public RTN_GestaoDeRotinaVO porId(Integer id){
		return manager.find(RTN_GestaoDeRotinaVO.class, id);
		
	}
	
	@Transactional
	public void inserirRotinaVO(RTN_GestaoDeRotinaVO rotina ){
		manager.merge(rotina);
	}
	
	public RTN_GestaoDeRotinaVO porAtividade(String Atividade){
		return manager.createQuery("select gr from RTN_GestaoDeRotinaVO gr where gr.nome_atividade like :Atividade", RTN_GestaoDeRotinaVO.class)
								.setParameter(Atividade,"%"+ Atividade+"%").getSingleResult();
	}
	
	public RTN_GestaoDeRotinaVO porNomeAtivo(String NomeAtivo){
		return manager.createQuery("select gr from RTN_GestaoDeRotinaVO gr where gr.nome_ativo = :NomeAtivo",  RTN_GestaoDeRotinaVO.class)
								.setParameter(NomeAtivo, "%"+NomeAtivo+"%").getSingleResult();
	}

	public List<RTN_GestaoDeRotinaVO> buscarTodasRotinas(){
		return manager.createQuery("from RTN_GestaoDeRotinaVO", RTN_GestaoDeRotinaVO.class).getResultList();
	}
	
	
}
