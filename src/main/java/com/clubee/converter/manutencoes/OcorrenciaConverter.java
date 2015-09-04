package com.clubee.converter.manutencoes;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.clubee.dao.manutencoes.MNT_OcorrenciaDAO;
import com.clubee.modelo.manutencoes.MNT_OcorrenciaVO;

@FacesConverter(forClass = MNT_OcorrenciaVO.class)
public class OcorrenciaConverter implements Converter {
	
	@Inject
	private MNT_OcorrenciaDAO ocorrenciaDAO;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		MNT_OcorrenciaVO retorno = null;
		
		if(value != null) {
			retorno = ocorrenciaDAO.porID(new Integer(value));
			
			return retorno;
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if(value != null && !"".equals(value)) {
			MNT_OcorrenciaVO ocorrencia = (MNT_OcorrenciaVO) value;
			
			String codigo = ocorrencia.getRequestID().toString();
			
			return codigo;
		}
		
		return null;
	}

}
