package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalControlador {

	@GetMapping("/votaApp")
	public String principal() {
		return "/index";
	}

	@GetMapping("/partido1")
	public String partidosPol1() {
		return "/partido1";
	}

	@GetMapping("/partido2")
	public String partidosPol() {
		return "/partido2";
	}

	@GetMapping("/partido3")
	public String partidosPol3() {
		return "/partido3";
	}

	@GetMapping("/partido4")
	public String partidosPol4() {
		return "/partido4";
	}

	@GetMapping("/addVotantes")
	public String Registrar() {
		return "/addVotante";
	}

}
