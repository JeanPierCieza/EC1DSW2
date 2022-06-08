package com.idat.examen.service;

import java.util.List;

import com.idat.examen.model.MallaCurricular;

public interface MallaCurricularService {
	
	void guardarMallaCurricular(MallaCurricular mallacurricular);
	void actualizarMallaCurricular(MallaCurricular mallacurricular);
	void eliminarMallaCurricular(Integer id);
	List<MallaCurricular> listarMallaCurricular();
	MallaCurricular obtenerMallaCurricularId(Integer id);

}
