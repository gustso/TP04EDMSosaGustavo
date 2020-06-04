package ar.edu.unju.edm.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.service.EquipoImplementacion;
import ar.edu.unju.edm.service.IUsuarioServiceImp;
//import ar.edu.unju.edm.service.EquipoInterface;
import ar.edu.unju.edm.modelo.Usuario;

@Controller
public class AplicacionController {
	@Autowired
	private EquipoImplementacion equipo;
	
	@Autowired
	private IUsuarioServiceImp usuarioService;

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
	public String cargarFormulario(Model model) {
		model.addAttribute("userForm", new Usuario());		
		return "usuarioForm";
	}
	
	@PostMapping("/formulario")
	public String crearUsuario(@ModelAttribute("userForm") Usuario usuario, ModelMap model) {		
			try {
				usuarioService.crear(usuario);
				model.addAttribute("userForm", new Usuario());			
				model.addAttribute("listTab", "active");				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// pasar las excepciones al html
				model.addAttribute("formUsuarioErrorMessage",e.getMessage());
				model.addAttribute("userForm", usuario);			
				model.addAttribute("formTab", "active");				
			}		
		
		//model.addAttribute("listaUsuarios", usuarioService.getAllUser());
		//model.addAttribute("roles", rolRepository.findAll());
		return "usuarioForm";
	}
}
