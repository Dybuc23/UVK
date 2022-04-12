package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import pe.com.uvk.entity.Cliente;

public interface ClienteService {
    
    List<Cliente> findAll();
	
    Optional<Cliente> findById(long id);
	
    Cliente add(Cliente c);
	
    Cliente update(Cliente c);
	
    Cliente delete(Cliente c);
}
