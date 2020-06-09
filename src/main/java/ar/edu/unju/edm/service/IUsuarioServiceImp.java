package ar.edu.unju.edm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.repository.IUsuarioRepository;
//import ar.edu.unju.edm.repository.IUsuarioRepositoryImp;

@Service
public class IUsuarioServiceImp implements IUsuarioService{
	
	@Autowired
	IUsuarioRepository iUsuario;

	@Override
	public void crear(Usuario unUsuario) {
		// TODO Auto-generated method stub		
		iUsuario.save(unUsuario);
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
	public Optional<Usuario> encontrarUsuario(Long id) {
		// TODO Auto-generated method stub
		Optional<Usuario> usuarioEncontrado = iUsuario.findById(id);
		return usuarioEncontrado;
	}


	@Override
	public Iterable<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return iUsuario.findAll();
	}

}
