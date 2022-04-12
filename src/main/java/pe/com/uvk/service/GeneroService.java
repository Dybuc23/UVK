package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import pe.com.uvk.entity.Genero;

public interface GeneroService {
    
    List<Genero> findAll();
	
    Optional<Genero> findById(long id);
	
    Genero add(Genero c);
	
    Genero update(Genero c);
	
    Genero delete(Genero c);
}
