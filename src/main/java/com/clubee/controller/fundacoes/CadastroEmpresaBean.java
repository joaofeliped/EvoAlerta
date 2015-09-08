package com.clubee.controller.fundacoes;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.clubee.modelo.fundacoes.Endereco;
import com.clubee.modelo.fundacoes.FND_EmpresaVO;
import com.clubee.modelo.fundacoes.Localizacao;
import com.clubee.service.fundacoes.EmpresaService;
import com.clubee.util.jpa.FacesUtil;

@Named
@ViewScoped
public class CadastroEmpresaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EmpresaService empresaService;

	private FND_EmpresaVO empresa;

	public CadastroEmpresaBean() {
		empresa = new FND_EmpresaVO();
		empresa.setLocalizacao(new Localizacao());
		empresa.setEndereco(new Endereco());
	}
	
	public void salvar() {
		empresaService.salvar(empresa);
		
		FacesUtil.addSuccessMessage("Empresa salva com sucesso.");
		
		empresa = new FND_EmpresaVO();
	}
	
	public FND_EmpresaVO getEmpresa() {
		return empresa;
	}

	public void setEmpresa(FND_EmpresaVO empresa) {
		this.empresa = empresa;
	}

}
