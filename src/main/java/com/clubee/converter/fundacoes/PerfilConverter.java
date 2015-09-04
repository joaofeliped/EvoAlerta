package com.clubee.converter.fundacoes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_PerfilDAO;
import com.clubee.modelo.fundacoes.FND_PerfilVO;

@FacesConverter(forClass = FND_PerfilVO.class)
public class PerfilConverter implements Converter {
	
	@Inject
	private FND_PerfilDAO perfilDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		FND_PerfilVO retorno = null;
		
		if(value != null) {
			retorno = perfilDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			FND_PerfilVO perfil = (FND_PerfilVO) value;
			
			String codigo = perfil.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
