package com.clubee.converter.fundacoes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_CategoriaOperacionalDAO;
import com.clubee.modelo.fundacoes.FND_CategoriaOperacionalVO;

@FacesConverter(forClass = FND_CategoriaOperacionalVO.class)
public class CategoriaOperacionalConverter implements Converter {
	
	@Inject
	private FND_CategoriaOperacionalDAO categoriaOperacionalDAO;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		FND_CategoriaOperacionalVO retorno = null;
		
		if(value != null) {
			retorno = categoriaOperacionalDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			FND_CategoriaOperacionalVO categoriaOperacional = (FND_CategoriaOperacionalVO) value;
			
			String codigo = categoriaOperacional.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
