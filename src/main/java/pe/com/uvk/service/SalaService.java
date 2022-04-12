package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import pe.com.uvk.entity.Sala;


public interface SalaService {
    List<Sala> findAll();
	
    Optional<Sala> findById(long id);
	
    Sala add(Sala s);
	
    Sala update(Sala s);
	
    Sala delete(Sala s);
}
