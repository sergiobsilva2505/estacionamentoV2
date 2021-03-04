package br.com.fcamara.trainee.estacionamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String olaMundo(Model model) {
		model.addAttribute("nome", "Olá Mundo!!!");
		return "hello";
	}

}
