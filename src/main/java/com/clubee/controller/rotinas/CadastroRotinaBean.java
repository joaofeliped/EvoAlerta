package com.clubee.controller.rotinas;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.clubee.dao.rotinas.RTN_RotinaDAO;
import com.clubee.modelo.rotinas.RTN_RotinaVO;

@Named
@SessionScoped
public class CadastroRotinaBean implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Inject
	private RTN_RotinaDAO rotinaDAO;
	
	private RTN_RotinaVO rotinaVO = new RTN_RotinaVO();

	public RTN_RotinaVO getTipoDeRotinaVO() {
		return rotinaVO;
	}

	public void setTipoDeRotinaVO(RTN_RotinaVO rotinaVO) {
		this.rotinaVO = rotinaVO;
	}
	
	
	public void cadastrarRotina(){
		
		rotinaDAO.inserirRotina(rotinaVO);
		
	}
	
	
}