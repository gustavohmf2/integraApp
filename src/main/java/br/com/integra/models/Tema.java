package br.com.integra.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Tema {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	private String descricao;
	private int duracao;
	private boolean status; //ativo ou inativo
	
	
	
	@OneToMany(mappedBy="tema")
	private List<Ideia> ideias;
	
	
	
	//Getters - Setters - HashCode - Equals - constructor
	public Tema() {}

	public Tema(int id, String titulo, String descricao, int duracao,
			boolean status, List<Ideia> ideias) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.duracao = duracao;
		this.status = status;
		this.ideias = ideias;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public List<Ideia> getIdeias() {
		return ideias;
	}

	public void setIdeias(List<Ideia> ideias) {
		this.ideias = ideias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + duracao;
		result = prime * result + id;
		result = prime * result + ((ideias == null) ? 0 : ideias.hashCode());
		result = prime * result + (status ? 1231 : 1237);
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tema other = (Tema) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (duracao != other.duracao)
			return false;
		if (id != other.id)
			return false;
		if (ideias == null) {
			if (other.ideias != null)
				return false;
		} else if (!ideias.equals(other.ideias))
			return false;
		if (status != other.status)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
	
}
