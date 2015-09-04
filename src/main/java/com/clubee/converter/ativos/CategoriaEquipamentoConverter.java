package com.clubee.converter.ativos;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.ativos.AST_CategoriaEquipamentoDAO;
import com.clubee.modelo.ativos.AST_CategoriaEquipamentoVO;

@FacesConverter(forClass = AST_CategoriaEquipamentoVO.class)
public class CategoriaEquipamentoConverter implements Converter {
	
	@Inject
	private AST_CategoriaEquipamentoDAO categoriaEquipamentoDAO;
	
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		AST_CategoriaEquipamentoVO retorno = null;
		
		if(value != null) {
			retorno = categoriaEquipamentoDAO.porID(new Integer(value));
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if(value != null) {
			AST_CategoriaEquipamentoVO tipoEquipamento = (AST_CategoriaEquipamentoVO) value;
			
			Integer codigo = tipoEquipamento.getRequestID();
			
			return codigo.toString();
		}
		
		return "";
	}

}
