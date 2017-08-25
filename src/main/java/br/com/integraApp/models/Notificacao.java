package br.com.integraApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Notificacao {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	/*@ManyToOne
	private Ideia ideia;*/
	private int novasCurtidas;
	private int novosComentarios;
	
	
	//Getters - Setters - HashCode - Equals - constructor
	public Notificacao() {}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/*public Ideia getIdeia() {
		return ideia;
	}
	public void setIdeia(Ideia ideia) {
		this.ideia = ideia;
	}*/
	public int getNovasCurtidas() {
		return novasCurtidas;
	}
	public void setNovasCurtidas(int novasCurtidas) {
		this.novasCurtidas = novasCurtidas;
	}
	public int getNovosComentarios() {
		return novosComentarios;
	}
	public void setNovosComentarios(int novosComentarios) {
		this.novosComentarios = novosComentarios;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	}
