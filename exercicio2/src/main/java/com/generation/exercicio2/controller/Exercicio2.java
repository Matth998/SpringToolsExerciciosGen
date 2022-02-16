package com.generation.exercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/exercicio2")
public class Exercicio2 {

	@GetMapping
	
	public String exercicio2() {
		
		return "<h1> Objetivos de aprendizado da semana </h1>"
				+ "<ul> <li> Aprende Banco de Dados completamente </li>"
				+ "<li> Aprender as funcionalidades dos SpringTools </li>"
				+ "<li> Melhorar meu Java </li> </ul>";
		
	}
	
}
