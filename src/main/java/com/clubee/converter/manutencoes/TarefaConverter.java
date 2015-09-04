package com.clubee.converter.manutencoes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.manutencoes.MNT_TarefaDAO;
import com.clubee.modelo.manutencoes.MNT_TarefaVO;

@FacesConverter(forClass = MNT_TarefaVO.class)
public class TarefaConverter implements Converter {
	
	@Inject
	private MNT_TarefaDAO tarefaDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		MNT_TarefaVO retorno = null;
		
		if(value != null) {
			retorno = tarefaDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			MNT_TarefaVO tarefa = (MNT_TarefaVO) value;
			
			String codigo = tarefa.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
