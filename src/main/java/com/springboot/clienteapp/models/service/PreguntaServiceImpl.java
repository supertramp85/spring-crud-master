
package com.springboot.clienteapp.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.clienteapp.models.entity.Pregunta;
import com.springboot.clienteapp.models.repository.PreguntaRepository;

@Service
public class PreguntaServiceImpl implements IPreguntaService {
	
	@Autowired
	private PreguntaRepository preguntaRepository;
	
	@Override
	public List<Pregunta> listarTodos() {
		return (List<Pregunta>) preguntaRepository.findAll();
	}

	

	@Override
	public Pregunta buscarPorId(Long id)  {		
		return preguntaRepository.findById(id).orElse(null);
	}

	
}
