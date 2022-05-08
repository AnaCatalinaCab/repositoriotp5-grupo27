package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.util.ArrayList;


import ar.edu.unju.fi.model.Curso;
import ar.edu.unju.fi.model.Docente;

@Controller

public class CursoController {

		@GetMapping("/curso")
		public String getCursoPage(Model model) {
			ArrayList<Curso> arrayCurso = new ArrayList<Curso>();
			Docente docente1 = new Docente(69,"Edumundo","Vazquez","edmundoquepasa@gmail.com","388-5959566");
			Curso cursoA = new Curso("ABC","Lengua",LocalDate.of(2020,05,05),LocalDate.of(2020, 06, 06),5,"virtual",docente1);
			
			
			arrayCurso.add(cursoA);
			model.addAttribute("lista",arrayCurso);
			return "curso";
		}
	
}
