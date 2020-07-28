package pe.edu.upeu.examcampos.DaoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.examcampos.entity.Libro;
import pe.edu.upeu.examcampos.Dao.LibroDao;

@Repository
public class LibroDaoImp implements LibroDao{
        
	    @Autowired
	    private JdbcTemplate jdbcTemplate;
	    
	    @Override
	    public List<Libro> readAll(){
	    	return jdbcTemplate.query("select * from libro", BeanPropertyRowMapper.newInstance(Libro.class));
	    }
}
