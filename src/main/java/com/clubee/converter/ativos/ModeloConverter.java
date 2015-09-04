package com.clubee.converter.ativos;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.ativos.AST_ModeloDAO;
import com.clubee.modelo.ativos.AST_ModeloVO;

@FacesConverter(forClass = AST_ModeloVO.class)
public class ModeloConverter implements Converter {
	
	@Inject
	private AST_ModeloDAO modeloDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		AST_ModeloVO retorno = null;
		
		if(value != null) {
			retorno = modeloDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			AST_ModeloVO modelo = (AST_ModeloVO) value;
			
			String codigo = modelo.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
