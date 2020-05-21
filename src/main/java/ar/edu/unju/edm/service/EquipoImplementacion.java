package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.modelo.EquipoFutbol;

@Service
public class EquipoImplementacion implements EquipoInterface{
	@Autowired
	private EquipoFutbol equipo;
	
	@Override
	public String recuperarNombre() {
		//equipo = new EquipoFutbol();
		equipo.setNombre("GyE");		
		return equipo.getNombre();
	}

}
