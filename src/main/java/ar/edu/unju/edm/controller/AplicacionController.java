package ar.edu.unju.edm.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
		model.addAttribute("usuarioDelForm", new Usuario());
		model.addAttribute("listaUsuarios", usuarioService.listarTodos());
		model.addAttribute("formTab", "active");
		return "usuarioForm";
	}
	
	@PostMapping("/formulario")
	public String crearUsuario(@Valid @ModelAttribute("usuarioDelForm") Usuario usuario, BindingResult result, ModelMap model) {
		//agregado Valid (en el modelo tambien) y BindingResult
		if(result.hasErrors()) {
			//si da error el objeto recibido se vuelve a enviar a la vista
			model.addAttribute("usarioDelForm", usuario);			
			model.addAttribute("formTab", "active");
			model.addAttribute("listaUsuarios", usuarioService.listarTodos());
		} else {		
			try {
				usuarioService.crear(usuario);
				model.addAttribute("usuarioDelForm", new Usuario());
				model.addAttribute("listTab", "active");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// pasar las excepciones al html
				model.addAttribute("formUsuarioErrorMessage",e.getMessage());
				model.addAttribute("usuarioDelForm", usuario);			
				model.addAttribute("listaUsuarios", usuarioService.listarTodos());
				model.addAttribute("formTab", "active");				
			}								
	}
		return "usuarioForm";
	}
	
	@GetMapping("/formulario/cancelar")
	public String cancelarEditarUsuario(ModelMap model){		
		return "redirect:/formulario";
	}
}
