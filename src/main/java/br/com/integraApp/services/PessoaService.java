package br.com.integraApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.integraApp.models.Pessoa;
import br.com.integraApp.repository.IPessoaRepository;

@Service
public class PessoaService {
	
	private Pessoa pessoa;
	
	@Autowired
	private IPessoaRepository pessoaRepository;
	
	public Pessoa getPessoa(){
		pessoa = new Pessoa();
		pessoa.setNome("Gustavo");
		pessoa.setIdade(25);
		return pessoa;
		
	}
	
	public void gravar(Pessoa pessoa){
		
		pessoaRepository.save(pessoa);
		
	}
}
