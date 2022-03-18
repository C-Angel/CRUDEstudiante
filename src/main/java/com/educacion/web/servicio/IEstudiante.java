package com.educacion.web.servicio;

import java.util.List;

import com.educacion.web.entidad.Estudiante;

public interface IEstudiante {

	public List<Estudiante> listarTodos();
	public void guardar(Estudiante estudiante);
	public Estudiante buscarPorId(Integer idestudiante); //Optional<Estudiante>
	//public Optional<Estudiante> buscarPorId(Integer idestudiante); 
	public void eliminar(Integer idestudiante);
}
