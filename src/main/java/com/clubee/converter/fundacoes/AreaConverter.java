package com.clubee.converter.fundacoes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_AreaDAO;
import com.clubee.modelo.fundacoes.FND_AreaVO;

@FacesConverter(forClass = FND_AreaVO.class)
public class AreaConverter implements Converter {
	
	@Inject
	private FND_AreaDAO areaDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		FND_AreaVO retorno = null;
		
		if(value != null) {
			retorno = areaDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			FND_AreaVO area = (FND_AreaVO) value;
			
			String codigo = area.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
