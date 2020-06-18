package ar.edu.unju.edm.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.edm.modelo.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario,Long>{	
	
	public Optional<Usuario> findByDni(Integer dni);
	public Optional<Usuario> findByApellido(String apellido);
}
