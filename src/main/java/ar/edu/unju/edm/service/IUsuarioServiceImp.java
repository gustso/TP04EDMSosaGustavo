package ar.edu.unju.edm.service;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.repository.IUsuario;

@Service
public class IUsuarioServiceImp implements IUsuarioService{
	
	@Autowired
	public IUsuario iUsuario;

	@Override
	public void crear(String apellido) {
		// TODO Auto-generated method stub
		iUsuario.crear(apellido);
	}

	
	//Interfaz de Usuario			Controller			Service			Repository			Modelo				Datos
	//HTML																			Clases (Usuario)	BD MySQL
	
	
	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List[] listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
