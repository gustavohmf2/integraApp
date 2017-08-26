package br.com.integra.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.integra.models.Pessoa;
import br.com.integra.repository.IPessoaRepository;

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
