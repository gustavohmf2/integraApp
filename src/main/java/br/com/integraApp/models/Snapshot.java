package br.com.integraApp.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Snapshot {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private Timestamp ultimoLogin;
	private int comentarios;
	private int curtidas;
	
	@ManyToOne
	private Ideia ideia;
	
	//Getters - Setters - HashCode - Equals - constructor
	
	public Snapshot() {}


	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	


	public Timestamp getUltimoLogin() {
		return ultimoLogin;
	}


	public void setUltimoLogin(Timestamp ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}


	public int getComentarios() {
		return comentarios;
	}


	public void setComentarios(int comentarios) {
		this.comentarios = comentarios;
	}


	public int getCurtidas() {
		return curtidas;
	}


	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}


	public Ideia getIdeia() {
		return ideia;
	}


	public void setIdeia(Ideia ideia) {
		this.ideia = ideia;
	}


	

	public void setId(Integer id) {
		this.id = id;
	}
	
	
		
}
