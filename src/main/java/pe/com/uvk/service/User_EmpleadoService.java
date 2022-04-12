package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import pe.com.uvk.entity.User_Empleado;


public interface User_EmpleadoService {
    List<User_Empleado> findAll();
	
    Optional<User_Empleado> findById(long id);
	
    User_Empleado add(User_Empleado u);
	
    User_Empleado update(User_Empleado u);
	
    User_Empleado delete(User_Empleado u);
}
