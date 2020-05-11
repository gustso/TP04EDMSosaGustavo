package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicacionController {

	@GetMapping("/inicio")
	public String iniciarSistema() {
		return "index";
	}
}
