package ar.edu.unju.edm.service;

import java.awt.List;

import ar.edu.unju.edm.modelo.Usuario;

public interface IUsuarioService {

	public void crear(String apellido);
	public Usuario modificar();
	public void eliminar();
	public List[] listar();
}
