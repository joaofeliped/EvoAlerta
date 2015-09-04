package com.clubee.converter.fundacoes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_DesignacaoDAO;
import com.clubee.modelo.fundacoes.FND_DesignacaoVO;

@FacesConverter(forClass = FND_DesignacaoVO.class)
public class DesignacaoConverter implements Converter {
	
	@Inject
	private FND_DesignacaoDAO designacaoDAO;
	
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		FND_DesignacaoVO retorno = null;
		
		if(value != null) {
			retorno = designacaoDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			FND_DesignacaoVO designacao = (FND_DesignacaoVO) value;
			
			String codigo = designacao.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
