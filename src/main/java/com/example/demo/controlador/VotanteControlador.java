package com.example.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.entidades.Votante;
import com.example.demo.servicio.VotanteService;

@Controller
public class VotanteControlador {
	
	@Autowired
	private VotanteService votanteServicio;
	
	@GetMapping("/listaVotantes")
	public String listarVotantes(Model model) {
		try {
			List<Votante> listVotante = votanteServicio.findAll();
			model.addAttribute("votantes", listVotante);
		}catch(Exception e) {
			System.out.println("Error: "+e.getCause());
		}
		return "/listaVotante";
	}
	
	@GetMapping("/nuevoVotante")
	public String addVotante(Model model) {
		model.addAttribute("votantes", new Votante());
		return "/addVotante";
	}
	
	@PostMapping("/saveVotante")
	public String GuardarVotante(@Validated Votante votante)
	{
		System.out.println("Votante-->"+votante.toString());
		votanteServicio.save(votante);
		return "redirect:/listaVotantes";
	}
	
	@GetMapping("/mostrarVotante/{id}")
	public String mostrar(@PathVariable int id, Model model) {
		Optional<Votante> votante = votanteServicio.findById(id);
		model.addAttribute("votantes", votante.get());
		return "/mostrar";
	}
	
	@GetMapping("/editarVotante/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional <Votante> votante = votanteServicio.findById(id);
		model.addAttribute("votantes",votante.get());
		
		return "/edit";
		
	}
	
	@GetMapping("/borrarVotante/{id}")
	public String borrar (@PathVariable int id) {
		votanteServicio.deleteById(id);
		return "redirect:/listaVotantes";
		
	}

}

