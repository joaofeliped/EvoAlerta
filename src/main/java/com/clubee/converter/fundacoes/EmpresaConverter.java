package com.clubee.converter.fundacoes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_EmpresaDAO;
import com.clubee.modelo.fundacoes.FND_EmpresaVO;

@FacesConverter(forClass = FND_EmpresaVO.class)
public class EmpresaConverter implements Converter {
	
	@Inject
	private FND_EmpresaDAO empresaDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		FND_EmpresaVO retorno = null;
		
		if(value != null) {
			retorno = empresaDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			FND_EmpresaVO empresa = (FND_EmpresaVO) value;
			
			String codigo = empresa.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
