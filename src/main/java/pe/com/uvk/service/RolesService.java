package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import pe.com.uvk.entity.Roles;


public interface RolesService {
    List<Roles> findAll();
	
    Optional<Roles> findById(long id);
	
    Roles add(Roles r);
	
    Roles update(Roles r);
	
    Roles delete(Roles r);
}
