package com.clubee.converter.rotinas;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.rotinas.RTN_RotinaDAO;
import com.clubee.modelo.rotinas.RTN_RotinaVO;

@FacesConverter(forClass = RTN_RotinaVO.class)
public class RotinaConverter implements Converter {
	
	@Inject
	private RTN_RotinaDAO rotinaDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		RTN_RotinaVO retorno = null;
		
		if(value != null) {
			retorno = rotinaDAO.porId(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			RTN_RotinaVO rotina = (RTN_RotinaVO) value;
			
			String codigo = rotina.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
