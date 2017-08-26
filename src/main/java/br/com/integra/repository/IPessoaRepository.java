package br.com.integra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.integra.models.Pessoa;

@Repository
public interface IPessoaRepository extends JpaRepository<Pessoa, Integer>{

}
