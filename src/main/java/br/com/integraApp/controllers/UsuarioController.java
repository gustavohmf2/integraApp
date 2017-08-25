package br.com.integraApp.controllers;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.integraApp.models.Usuario;
import br.com.integraApp.services.UsuarioService;

@Named
@ViewScoped
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	private Usuario usuario = new Usuario();
	
	public void cadastrar(){
		
		System.out.println(usuario);
		usuarioService.cadastrar(usuario);
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
