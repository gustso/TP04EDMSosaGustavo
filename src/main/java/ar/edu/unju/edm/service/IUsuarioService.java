package ar.edu.unju.edm.service;

import java.awt.List;
import java.util.Optional;

import ar.edu.unju.edm.modelo.Usuario;

public interface IUsuarioService {

	public void crear(Usuario unUsuario);
	public Usuario modificar();
	public void eliminar();
	public List[] listar();
	public Optional<Usuario> encontrarUsuario(Long id);
}
