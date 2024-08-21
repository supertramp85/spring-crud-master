package com.springboot.clienteapp.models.service;

import java.util.List;

import com.springboot.clienteapp.models.entity.Pregunta;

public interface IPreguntaService {
	
	public List<Pregunta> listarTodos();
	public Pregunta buscarPorId(Long id);
	
	
}
