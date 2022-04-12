package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import pe.com.uvk.entity.Asiento;


public interface AsientoService {
    List<Asiento> findAll();
	
    Optional<Asiento> findById(long id);
	
    Asiento add(Asiento a);
	
    Asiento update(Asiento a);
	
    Asiento delete(Asiento a);
}
