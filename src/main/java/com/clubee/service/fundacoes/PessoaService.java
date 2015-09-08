package com.clubee.service.fundacoes;

import javax.inject.Inject;

import com.clubee.dao.fundacoes.FND_PessoaDAO;
import com.clubee.modelo.fundacoes.FND_PessoaVO;
import com.clubee.util.jpa.Transactional;

public class PessoaService {
	
	@Inject
	private FND_PessoaDAO pessoaDAO;
	
	@Transactional
	public void salvar(FND_PessoaVO pessoa) {
		pessoaDAO.inserirPessoaVO(pessoa);
	}
}
