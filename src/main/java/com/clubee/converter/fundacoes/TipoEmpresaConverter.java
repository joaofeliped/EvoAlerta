package com.clubee.converter.fundacoes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_TipoEmpresaDAO;
import com.clubee.modelo.fundacoes.FND_TipoEmpresaVO;

@FacesConverter(forClass = FND_TipoEmpresaVO.class)
public class TipoEmpresaConverter implements Converter {
	
	@Inject
	private FND_TipoEmpresaDAO tipoEmpresaDAO;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		FND_TipoEmpresaVO retorno = null;
		
		if(value != null) {
			retorno = tipoEmpresaDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			FND_TipoEmpresaVO tipoEmpresa = (FND_TipoEmpresaVO) value;
			
			String codigo = tipoEmpresa.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
