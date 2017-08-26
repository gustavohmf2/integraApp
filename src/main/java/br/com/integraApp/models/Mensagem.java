package br.com.integraApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Mensagem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private int destinatario; //ID DO USUARIO
	private String texto;
	
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario; //duvida em relação ao relacionamento com mensagem/ email/ texto

	
	//Getters - Setters - HashCode - Equals - constructor
	
	public Mensagem() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(int destinatario) {
		this.destinatario = destinatario;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	}
