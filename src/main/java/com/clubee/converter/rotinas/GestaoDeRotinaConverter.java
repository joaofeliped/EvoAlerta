package com.clubee.converter.rotinas;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.rotinas.RTN_GestaoDeRotinaDAO;
import com.clubee.modelo.rotinas.RTN_GestaoDeRotinaVO;

@FacesConverter(forClass = RTN_GestaoDeRotinaVO.class)
public class GestaoDeRotinaConverter implements Converter {
	
	@Inject
	private RTN_GestaoDeRotinaDAO gestaoDeRotinaDAO;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		RTN_GestaoDeRotinaVO retorno = null;
		
		if(value != null) {
			retorno = gestaoDeRotinaDAO.porId(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			RTN_GestaoDeRotinaVO gestaoDeRotina = (RTN_GestaoDeRotinaVO) value;
			
			String codigo = gestaoDeRotina.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
