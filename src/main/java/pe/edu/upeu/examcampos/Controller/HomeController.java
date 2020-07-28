package pe.edu.upeu.examcampos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.examcampos.entity.Libro;
import pe.edu.upeu.examcampos.service.LibroService;

@RestController
public class HomeController {

	@Autowired
	private LibroService libroservice;
	
	@GetMapping("/libro")
	public List<Libro> mensaje(){
		return libroservice.readAll();
	}
}
