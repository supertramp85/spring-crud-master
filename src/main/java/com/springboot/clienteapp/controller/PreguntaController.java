package com.springboot.clienteapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.clienteapp.models.entity.Ciudad;
import com.springboot.clienteapp.models.entity.Pregunta;
import com.springboot.clienteapp.models.service.IPreguntaService;


@Controller
@RequestMapping("/views/pregunta")
public class PreguntaController {

	@Autowired
	private IPreguntaService preguntaService;


	@GetMapping("/")
	public String listarPregunta(Model model) {
		List<Pregunta> listadoPregunta = preguntaService.listarTodos();

		model.addAttribute("titulo", "Lista de Preguntas");
		model.addAttribute("pregunta", listadoPregunta);

		return "/views/pregunta/listar-pregunta";
	}

	
}
