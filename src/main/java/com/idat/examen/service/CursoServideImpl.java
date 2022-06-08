package com.idat.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examen.model.Curso;
import com.idat.examen.repository.CursoRepository;

@Service
public class CursoServideImpl implements CursoService {

	@Autowired
	private CursoRepository repository;
	@Override
	public void guardarCurso(Curso curso) {
		// TODO Auto-generated method stub
		repository.save(curso);

	}

	@Override
	public void actualizarCurso(Curso curso) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(curso);

	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Curso obtenerCursoId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
