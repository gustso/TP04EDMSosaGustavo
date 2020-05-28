package ar.edu.unju.edm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.modelo.EquipoFutbol;
import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.service.IUsuarioService;

@SpringBootApplication
public class Tp04SosaGustavoApplication implements CommandLineRunner{
	
	@Autowired
	private EquipoFutbol equipo;

	@Autowired
	private IUsuarioService usuarioService;
	
	public static void main(String[] args) {
		//equipo = new EquipoFutbol("GyE");
		//equipo.setNombre("GyE");
		SpringApplication.run(Tp04SosaGustavoApplication.class, args);
		//llamarEquipo();
	}

	//public static void llamarEquipo() {
		//equipo.setNombre("GYE");
	
	//}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		equipo.setNombre("GyE");
		System.out.println(equipo);
		
		usuarioService.crear("Sosa");
		
	}
}
