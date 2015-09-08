package com.clubee.service.fundacoes;

import java.io.Serializable;

import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_PessoaDAO;
import com.clubee.modelo.fundacoes.FND_PessoaVO;
import com.clubee.util.jpa.Transactional;

public class PessoaService implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private FND_PessoaDAO pessoaDAO;
	
	@Transactional
	public void salvar(FND_PessoaVO pessoa) {
		pessoaDAO.inserirPessoaVO(pessoa);
	}
}
