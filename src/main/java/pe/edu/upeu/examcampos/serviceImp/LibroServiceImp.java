package pe.edu.upeu.examcampos.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.examcampos.Dao.LibroDao;
import pe.edu.upeu.examcampos.entity.Libro;
import pe.edu.upeu.examcampos.service.LibroService;

@Service
public class LibroServiceImp implements LibroService{

	@Autowired
	private LibroDao LibroDao;
	
	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return LibroDao.readAll();
	}
}
