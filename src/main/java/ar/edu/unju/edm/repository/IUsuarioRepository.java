package ar.edu.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;

//import org.springframework.data.repository.CrudRepository;

import ar.edu.unju.edm.modelo.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario,Long>{	
	
	
}
