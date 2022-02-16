package com.generation.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/exercicio1")
public class Exercicio1 {

	@GetMapping
	
	public String exercicio1() {
		
		return "<h1> Habilidades utilizadas para realizar a atividade: </h1>"
				+ "<ul> <li> Persistência </li>"
				+ "<li> Mentalidade de Crescimento </li>"
				+ "<li> Orientação ao Futuro </li> </ul>"
				+ "<h1> Mentalidades utilizadas para realizar a atividade: </h1>"
				+ "<ul> <li> Proatividade </li>"
				+ "<li> Orientação ao Detalhe </li> </ul>";
		
	}
	
}
