package com.idat.examen.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "MallaCurricular")
@Entity
public class MallaCurricular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMalla;
	private Integer año;
	
	@OneToOne
	@JoinColumn(name ="id_universidad",
	nullable = false,
	unique = true,
	foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_universidad) references Universidad (id_universidad)")
	)
	private Universidad universidad;
	
	@OneToMany(mappedBy = "mallacurricular")
	private List<Curso> curso;
	
	
	public Integer getIdMalla() {
		return idMalla;
	}
	public void setIdMalla(Integer idMalla) {
		this.idMalla = idMalla;
	}
	public Integer getAño() {
		return año;
	}
	public void setAño(Integer año) {
		this.año = año;
	}
	
	

}
