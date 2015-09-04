package com.clubee.converter.ativos;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.ativos.AST_FabricanteDAO;
import com.clubee.modelo.ativos.AST_FabricanteVO;

@FacesConverter(forClass = AST_FabricanteVO.class)
public class FabricanteConverter implements Converter {
	
	@Inject
	private AST_FabricanteDAO fabricanteDAO;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		AST_FabricanteVO retorno = null;
		
		if(value != null) {
			retorno = fabricanteDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component1, Object value) {
		if(value != null && !"".equals(value)) {
			AST_FabricanteVO fabricante = (AST_FabricanteVO) value;
			
			String codigo = fabricante.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
