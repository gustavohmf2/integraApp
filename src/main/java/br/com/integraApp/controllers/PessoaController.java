package br.com.integraApp.controllers;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.integraApp.models.Pessoa;
import br.com.integraApp.services.PessoaService;

@Named
@ViewScoped
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	private Pessoa pessoa = new Pessoa();
	
	public Pessoa getPessoa() {
		
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public void cadastrar(){
		
		System.out.println(pessoaService.getPessoa());
		System.out.println(pessoa);
		pessoaService.gravar(pessoa);
	}
}
