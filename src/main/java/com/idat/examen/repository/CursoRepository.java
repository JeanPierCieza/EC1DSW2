package com.idat.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.examen.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
