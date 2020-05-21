package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.service.EquipoImplementacion;
//import ar.edu.unju.edm.service.EquipoInterface;

@Controller
public class AplicacionController {
	@Autowired
	private EquipoImplementacion equipo;

	@GetMapping("/inicio")
	public String iniciarSistema() {
		return "index";
	}
	
	@GetMapping("/servicio")
	public String brindarServicio() {
		return "servicio";
	}
	
	@GetMapping("/home")
	public ModelAndView brindarOtroServicio() {
		String nombreEquipo = equipo.recuperarNombre();
		//basico
		ModelAndView model = new ModelAndView("servicio");
		model.addObject("nombreEquipo",nombreEquipo);		
		return model;
	}	
	
	@GetMapping("/formulario")
	public String cargarFormulario() {
		return "usuarioForm";
	}
}
