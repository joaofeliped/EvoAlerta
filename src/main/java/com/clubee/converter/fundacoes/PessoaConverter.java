package com.clubee.converter.fundacoes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_PessoaDAO;
import com.clubee.modelo.fundacoes.FND_PessoaVO;

@FacesConverter(forClass = FND_PessoaVO.class)
public class PessoaConverter implements Converter {
	
	@Inject
	private FND_PessoaDAO pessoaDAO;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		FND_PessoaVO retorno = null;
		
		if(value != null) {
			retorno = pessoaDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			FND_PessoaVO pessoa = (FND_PessoaVO) value;
			
			String codigo = pessoa.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
