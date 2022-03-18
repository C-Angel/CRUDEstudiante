package com.educacion.web.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexcontroller {
	
	
	@GetMapping({"/index","/home","/"})
	
	public String index()
	{
		return "index";
	}

}
