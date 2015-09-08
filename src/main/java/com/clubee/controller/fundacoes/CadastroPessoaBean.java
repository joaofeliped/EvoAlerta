package com.clubee.controller.fundacoes;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.clubee.dao.fundacoes.FND_EmpresaDAO;
import com.clubee.modelo.fundacoes.Endereco;
import com.clubee.modelo.fundacoes.FND_EmpresaVO;
import com.clubee.modelo.fundacoes.FND_PessoaVO;
import com.clubee.modelo.fundacoes.Localizacao;
import com.clubee.modelo.fundacoes.Sexo;
import com.clubee.modelo.fundacoes.TipoPessoa;
import com.clubee.service.fundacoes.PessoaService;
import com.clubee.util.jpa.FacesUtil;

@Named
@ViewScoped
public class CadastroPessoaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PessoaService pessoaService;
	
	@Inject
	private FND_EmpresaDAO empresaDAO;
	
	private FND_PessoaVO pessoa;
	
	public CadastroPessoaBean() {
		pessoa = new FND_PessoaVO();
		pessoa.setLocalizacao(new Localizacao());
		pessoa.setEndereco(new Endereco());
	}
	
	public void salvar() {
		pessoaService.salvar(pessoa);
		
		FacesUtil.addSuccessMessage("Pessoa salva com sucesso.");
		
		pessoa = new FND_PessoaVO();
	}
	
	public List<Sexo> getSexo() {
		return Arrays.asList(Sexo.values());
	}
	
	public List<TipoPessoa> getTipoPessoa() {
		return Arrays.asList(TipoPessoa.values());
	}
	
	public List<FND_EmpresaVO> getEmpresas() {
		return empresaDAO.buscarTodasEmpresas();
	}
	
	public FND_PessoaVO getPessoa() {
		return pessoa;
	}

	public void setPessoa(FND_PessoaVO pessoa) {
		this.pessoa = pessoa;
	}
}
