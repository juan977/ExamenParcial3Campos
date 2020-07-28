package pe.edu.upeu.examcampos.Dao;

import java.util.List;

import pe.edu.upeu.examcampos.entity.Libro;

public interface LibroDao {
	
	List<Libro> readAll();
}
