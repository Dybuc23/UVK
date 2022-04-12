package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import pe.com.uvk.entity.Empleado;

public interface EmpleadoService {
    List<Empleado> findAll();
	
    Optional<Empleado> findById(long id);
	
    Empleado add(Empleado e);
	
    Empleado update(Empleado e);
	
    Empleado delete(Empleado e);
}
