package br.com.integra.services;

import br.com.integra.models.Usuario;

public interface IUsuarioService {
	
	public void cadastrar(Usuario usuario);
	public Usuario buscarPorId(Integer id);
}
