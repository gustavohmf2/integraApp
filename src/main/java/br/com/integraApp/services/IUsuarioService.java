package br.com.integraApp.services;

import br.com.integraApp.models.Usuario;

public interface IUsuarioService {
	
	public void cadastrar(Usuario usuario);
	public Usuario buscarPorId(Integer id);
}
