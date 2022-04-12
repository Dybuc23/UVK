package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import pe.com.uvk.entity.Pelicula;

public interface PeliculaService {
    
    List<Pelicula> findAll();
	
    Optional<Pelicula> findById(long id);
	
    Pelicula add(Pelicula p);
	
    Pelicula update(Pelicula p);
	
    Pelicula delete(Pelicula p);
}
