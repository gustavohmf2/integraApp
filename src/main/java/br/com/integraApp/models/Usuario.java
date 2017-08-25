package br.com.integraApp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import br.com.integraApp.enums.Papel;

@Entity
public class Usuario {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String login;
	private String senha;
	@Enumerated(EnumType.STRING)
	private Papel papel;
	
	@ManyToMany
	@JoinTable(name="ideia_usuario")//define que a tabela ideia guardara a chave estrangera
	private List<Ideia> ideias;
	
	/*private Mensagem mensagem;*/
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Papel getPapel() {
		return papel;
	}
	public void setPapel(Papel papel) {
		this.papel = papel;
	}
	/*public Mensagem getMensagem() {
		return mensagem;
	}
	public void setMensagem(Mensagem mensagem) {
		this.mensagem = mensagem;
	}*/
	public List<Ideia> getIdeias() {
		return ideias;
	}
	public void setIdeias(List<Ideia> ideias) {
		this.ideias = ideias;
	}
	
}
