package com.idat.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.examen.model.MallaCurricular;
import com.idat.examen.service.MallaCurricularService;

@Controller
@RequestMapping(path = "/mallacurricular/ec1")
public class MallaCurricularController {
	
	@Autowired
	private MallaCurricularService service;
	

	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<MallaCurricular>> listar(){
		return new ResponseEntity<List<MallaCurricular>>(service.listarMallaCurricular(),HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody MallaCurricular mallacurricular){
		service.guardarMallaCurricular(mallacurricular);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		
		MallaCurricular m = service.obtenerMallaCurricularId(id);
		
		if(m != null) {
			service.eliminarMallaCurricular(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody MallaCurricular mallacurricular){
		MallaCurricular m = service.obtenerMallaCurricularId(mallacurricular.getIdMalla());
		
		if(m != null) {
			service.actualizarMallaCurricular(mallacurricular);
			return new ResponseEntity<Void>(HttpStatus.OK);
	}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<MallaCurricular> obtenerId(@PathVariable Integer id){
		MallaCurricular m = service.obtenerMallaCurricularId(id);
		
		if(m != null) {
			return new ResponseEntity<MallaCurricular>(service.obtenerMallaCurricularId(id),HttpStatus.OK);
	}
		return new ResponseEntity<MallaCurricular>(HttpStatus.NOT_FOUND);
	}
	
	

}
