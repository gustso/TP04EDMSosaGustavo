package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.modelo.Usuario;
import ar.edu.unju.edm.service.IUsuarioServiceImp;

@Controller
public class LoginController {
		
	@Autowired
	private IUsuarioServiceImp usuarioService;
	@Autowired
	private Usuario unUsuario;
	
	@GetMapping({"/","/login"})
	public String ingresarLogin(Model model) {
		model.addAttribute("usuarioDelForm", new Usuario());
		return "login";
	}
	
	@PostMapping("/ingresarUsuario")
	public String loginUsuario(@ModelAttribute("usuarioDelForm") Usuario usuario, ModelMap model) throws Exception{
		String redireccion = "";
			try {				
				Usuario usuarioEncontrado = usuarioService.encontrarUsuarioDni(usuario);
				//usuarioService.validarCredenciales(usuarioEncontrado.getPassword(),usuario.getPassword());
				if (usuarioEncontrado == null) {		        
		            throw new Exception("No hay coincidencia entre dni or password.");
		        }
				redireccion = usuarioService.redirigirUsuario(usuarioEncontrado);
				model.addAttribute("usuarioDelForm", usuarioEncontrado);
				return redireccion;	
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// pasar las excepciones al html
				model.addAttribute("formLoginErrorMessage",e.getMessage());
				model.addAttribute("usuarioDelForm", unUsuario);
				return "/login";
			}			
	}
}
