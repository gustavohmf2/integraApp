package br.com.integra.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.integra.models.Usuario;
import br.com.integra.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void cadastrar(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public Usuario buscarPorId(Integer id) {
		return usuarioRepository.findOne(id);
	}

}
