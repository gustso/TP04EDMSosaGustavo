package ar.edu.unju.edm.repository;

import java.awt.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.Tp04SosaGustavoApplication;
import ar.edu.unju.edm.modelo.Usuario;

@Repository
public class IUsuarioImp implements IUsuario{

	@Autowired
	private Usuario usuario;
	
	public static Logger LOG = LoggerFactory.getLogger(Tp04SosaGustavoApplication.class);
	
	@Override
	public void crear(String apellido) {
		// TODO Auto-generated method stub
		//usuario = new Usuario();
		usuario.setApellido(apellido);
		LOG.info("El Usuario "+ usuario.getApellido()+" fue guardado con EXITO");
		
	}

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
