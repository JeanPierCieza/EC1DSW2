package com.idat.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.examen.model.MallaCurricular;
import com.idat.examen.repository.MallaCurricularRepository;


@Service
public class MallaCurricularServiceImpl implements MallaCurricularService {

	@Autowired
	private MallaCurricularRepository repository;
	@Override
	public void guardarMallaCurricular(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		repository.save(mallacurricular);

	}

	@Override
	public void actualizarMallaCurricular(MallaCurricular mallacurricular) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(mallacurricular);

	}

	@Override
	public void eliminarMallaCurricular(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<MallaCurricular> listarMallaCurricular() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public MallaCurricular obtenerMallaCurricularId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
