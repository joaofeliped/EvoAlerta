package com.clubee.converter.ativos;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.ativos.AST_MarcaDAO;
import com.clubee.modelo.ativos.AST_MarcaVO;

@FacesConverter(forClass = AST_MarcaVO.class)
public class MarcaConverter implements Converter {

	@Inject
	private AST_MarcaDAO marcaDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		AST_MarcaVO retorno = null;
		
		if(value != null) {
			retorno = marcaDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			AST_MarcaVO marca = (AST_MarcaVO) value;
			
			String codigo = marca.getRequestID().toString();
			
			return codigo;
		}
		
		
		return null;
	}

}
