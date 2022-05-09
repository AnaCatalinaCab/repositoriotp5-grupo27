package ar.edu.unju.fi.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.Beca;
import ar.edu.unju.fi.model.Curso;
import ar.edu.unju.fi.model.Docente;

@Controller
public class BeneficioController {

	@GetMapping("/beneficios")
	public String getBecasPage(Model model) {
		Curso curso;
		Beca beca;
		
		ArrayList<Beca> listaBecas = new ArrayList<Beca>();
		Docente profe1 = new Docente(69,"Edumundo","Vazquez","edmundoquepasa@gmail.com",388566);
		curso = new Curso(2,"Programcion I","APU",LocalDate.of(2022,03,29),LocalDate.of(2020, 07, 01),5,"presencial",profe1);
		beca = new Beca(1, curso, LocalDate.of(2022,03,29), LocalDate.of(2022,04,29), "finalizado");
		listaBecas.add(beca);
		curso = new Curso(5,"Programcion II","APU",LocalDate.of(2022,03,29),LocalDate.of(2020, 07, 01),5,"virtual",profe1);
		beca = new Beca(1, curso, LocalDate.of(2022,03,01), LocalDate.of(2022,04,01), "finalizado");
		listaBecas.add(beca);
		model.addAttribute("titulo", "BENEFICIOS Y BECAS");
		model.addAttribute("becas",listaBecas);
		return "beneficios";
	}
	
	
}
