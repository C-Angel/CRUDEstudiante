package com.educacion.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacion.web.entidad.Estudiante;
import com.educacion.web.repositorio.EstudianteRepositorio;


@Service
public class EstudianteServicelmpl implements IEstudiante {

	@Autowired
	private EstudianteRepositorio estudianteRepositorio;
	@Override
	public List<Estudiante> listarTodos() {
	
		
		
		return (List<Estudiante>) estudianteRepositorio.findAll();
	}

	@Override
	public void guardar(Estudiante estudiante) {
		
		estudianteRepositorio.save(estudiante);
		
	}

	@Override
	public Estudiante buscarPorId(Integer idestudiante) {
		
		Estudiante objVacio_Estudiante = new Estudiante();
		
		Estudiante est = estudianteRepositorio.findById(idestudiante).orElse(objVacio_Estudiante);
		return est;
	}

	@Override
	public void eliminar(Integer idestudiante) {
		estudianteRepositorio.deleteById(idestudiante);
		
	}

}
