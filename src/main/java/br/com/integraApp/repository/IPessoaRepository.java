package br.com.integraApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.integraApp.models.Pessoa;

@Repository
public interface IPessoaRepository extends JpaRepository<Pessoa, Integer>{

}
