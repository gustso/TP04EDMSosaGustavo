package ar.edu.unju.edm.repository;

import java.awt.List;

import ar.edu.unju.edm.modelo.Usuario;

public interface IUsuario {
		
	public void crear(String apellido);
	public Usuario modificar();
	public void eliminar();
	public List[] listar();

}
