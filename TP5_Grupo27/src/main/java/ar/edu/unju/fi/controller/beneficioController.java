package ar.edu.unju.fi.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class beneficioController {

	@GetMapping("/inicio")
	public String getIndePage() {
		return "index"; // esta parte devuelve la pagina index.html
	}
}
