package br.com.integra.models;

import java.io.File;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

import br.com.integra.models.Notificacao;
import br.com.integra.models.Snapshot;
import br.com.integra.models.Tema;

@Entity
public class Ideia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String proposta;
	private String beneficios;
	private String informacoes;
	private String linkVideo;
	private boolean estado;
	private File arquivo;
	private int numeroDeComentarios;
	private int numeroDeCurtidas;
	private int indiceDePopularidade;
	
	@ManyToOne
	@JoinColumn(name="tema_id")
	private Tema tema;
	
	/*private Notificacao notificacao; // notificação é uma class
*/	
	@ManyToMany
	@JoinTable(name="ideia_usuario",
		joinColumns = @JoinColumn(name="ideia_id"),
		inverseJoinColumns = @JoinColumn(name="usuario_id"))
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy="ideia")
	private List<Comentario> comentarios;
	
	@OneToMany
	@JoinColumn(name="ideia_id")
	private List<Snapshot> snapshots;

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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
	
	/*@Override
	public String toString() {
		return "Ideia [id=" + id + ", usuario=" + usuarios + ", titulo=" + titulo + ", proposta=" + proposta
				+ ", beneficios=" + beneficios + ", informacoes=" + informacoes + ", linkVideo=" + linkVideo
				+ ", estado=" + estado + "]";
	}*/


	public File getArquivo() {
		return arquivo;
	}


	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}


	public int getNumeroDeComentarios() {
		return numeroDeComentarios;
	}


	public void setNumeroDeComentarios(int numeroDeComentarios) {
		this.numeroDeComentarios = numeroDeComentarios;
	}


	public int getNumeroDeCurtidas() {
		return numeroDeCurtidas;
	}


	public void setNumeroDeCurtidas(int numeroDeCurtidas) {
		this.numeroDeCurtidas = numeroDeCurtidas;
	}


	public int getIndiceDePopularidade() {
		return indiceDePopularidade;
	}


	public void setIndiceDePopularidade(int indiceDePopularidade) {
		this.indiceDePopularidade = indiceDePopularidade;
	}


	public List<Comentario> getComentarios() {
		return comentarios;
	}


	/*public Notificacao getNotificacao() {
		return notificacao;
	}


	public void setNotificacao(Notificacao notificacao) {
		this.notificacao = notificacao;
	}*/


	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}


	public List<Usuario> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	
}
