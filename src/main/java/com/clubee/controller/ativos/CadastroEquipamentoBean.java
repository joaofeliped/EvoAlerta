package com.clubee.controller.ativos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.clubee.dao.ativos.AST_CategoriaEquipamentoDAO;
import com.clubee.modelo.ativos.AST_CategoriaEquipamentoVO;
import com.clubee.modelo.ativos.AST_EquipamentoVO;
import com.clubee.modelo.ativos.AST_TipoEquipamentoVO;
import com.clubee.modelo.ativos.DadosDataEquipamento;
import com.clubee.modelo.ativos.StatusEquipamento;
import com.clubee.service.ativos.EquipamentoService;

@Named
@ViewScoped
public class CadastroEquipamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private EquipamentoService equipamentoService;
	
	@Inject
	private AST_CategoriaEquipamentoDAO categoriaEquipamentoDAO;
	
	private AST_EquipamentoVO equipamento;
	
	private List<AST_TipoEquipamentoVO> tipos;
	
	public CadastroEquipamentoBean() {
		equipamento = new AST_EquipamentoVO();
		equipamento.setDadosDeDatas(new DadosDataEquipamento());
		
		tipos = new ArrayList<>();
	}
	
	public void salvar() {
		equipamentoService.salvar(equipamento);
	}
	
	public List<AST_CategoriaEquipamentoVO> getCategorias() {
		return categoriaEquipamentoDAO.buscarTodasCategoriasEquipamento();
	}
	
	public void popularTipos() {
		AST_CategoriaEquipamentoVO categoria = equipamento.getCategoria();
		
		tipos.clear();
		
		if(categoria != null) {
			tipos = categoriaEquipamentoDAO.buscarTiposPorCategoria(categoria);
		}
	}
	
	public List<StatusEquipamento> getStatusEquipamento() {
		return Arrays.asList(StatusEquipamento.values());
	}

	public AST_EquipamentoVO getEquipamento() {
		if(equipamento == null) {
			equipamento = new AST_EquipamentoVO();
		}
		return equipamento;
	}

	public void setEquipamento(AST_EquipamentoVO equipamento) {
		this.equipamento = equipamento;
	}
	
	public List<AST_TipoEquipamentoVO> getTipos() {
		return tipos;
	}
	
	public void setTipos(List<AST_TipoEquipamentoVO> tipos) {
		this.tipos = tipos;
	}
}
