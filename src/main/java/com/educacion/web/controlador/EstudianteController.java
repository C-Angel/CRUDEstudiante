package com.educacion.web.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.educacion.web.entidad.Estudiante;
import com.educacion.web.servicio.IEstudiante;

@Controller
@RequestMapping("/")
public class EstudianteController {

	
@Autowired
private IEstudiante service;



@GetMapping("/views/estudiantes")
public String listarestudiantes(Model model)
{
	List<Estudiante> listadoestudiantes= service.listarTodos();
	
	model.addAttribute("titulo","Listado de Estudiantes");
	model.addAttribute("estudiantes",listadoestudiantes);
	
	return "/views/estudiantes/listar";
}

@GetMapping("/crear")
public String crear (Model model)
{
	Estudiante estudiante = new Estudiante();
	
	
	
return null;
}
}
