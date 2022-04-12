package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import pe.com.uvk.entity.Ciudad;


public interface CiudadService {
    List<Ciudad> findAll();
	
    Optional<Ciudad> findById(long id);
	
    Ciudad add(Ciudad c);
	
    Ciudad update(Ciudad c);
	
    Ciudad delete(Ciudad c);
}
