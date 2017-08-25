package br.com.integraApp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ideia {

	@Id
	private Integer id;
	private String titulo;
	private String proposta;
	private String beneficios;
	private String informacoes;
	private String linkVideo;
	private boolean estado;
	@ManyToOne
	@JoinColumn(name="usuario_id")//define que a tabela
	private Usuario usuario;
	@OneToMany(mappedBy="ideia")
	private List<Comentario> comentarios;
	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getProposta() {
		return proposta;
	}


	public void setProposta(String proposta) {
		this.proposta = proposta;
	}


	public String getBeneficios() {
		return beneficios;
	}


	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}


	public String getInformacoes() {
		return informacoes;
	}


	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}


	public String getLinkVideo() {
		return linkVideo;
	}


	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "Ideia [id=" + id + ", usuario=" + usuario + ", titulo=" + titulo + ", proposta=" + proposta
				+ ", beneficios=" + beneficios + ", informacoes=" + informacoes + ", linkVideo=" + linkVideo
				+ ", estado=" + estado + "]";
	}

	
}
