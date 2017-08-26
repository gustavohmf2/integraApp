package br.com.integraApp.models;

public class Notificacao {
	
	
	private Integer id;
	
	private Ideia ideia;
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
	public Ideia getIdeia() {
		return ideia;
	}
	public void setIdeia(Ideia ideia) {
		this.ideia = ideia;
	}
	
	}
