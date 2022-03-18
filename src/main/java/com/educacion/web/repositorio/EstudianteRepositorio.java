package com.educacion.web.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.educacion.web.entidad.Estudiante;

public interface EstudianteRepositorio extends CrudRepository<Estudiante,Integer> {

}
