package ar.edu.unju.edm.modelo;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class EquipoFutbol implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	
	public EquipoFutbol() {
		// TODO Auto-generated constructor stub
	}

	
	public EquipoFutbol(String nombre) {
		super();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EquipoFutbol other = (EquipoFutbol) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "EquipoFutbol [nombre=" + nombre + "]";
	}
	

}
