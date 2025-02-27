package br.belmicro.api.teste.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import br.belmicro.api.teste.configuration.Dados;
import br.belmicro.api.teste.modelo.Produto;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	private final Dados dados;

	public ProdutoService(Dados dados) {
		this.dados = dados;
	}

	public List<Produto> getAll(){
		return dados.getProdutos();
	}
	
	public Produto create(Produto prd) {
		prd.setId(UUID.randomUUID());
		dados.getProdutos().add(prd);
		return prd;
	}
}
