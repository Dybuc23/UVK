package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import pe.com.uvk.entity.Sede;

public interface SedeService {
    List<Sede> findAll();
	
    Optional<Sede> findById(long id);
	
    Sede add(Sede s);
	
    Sede update(Sede s);
	
    Sede delete(Sede s);
}
