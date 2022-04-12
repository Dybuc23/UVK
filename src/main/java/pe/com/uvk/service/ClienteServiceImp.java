package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.uvk.entity.Cliente;
import pe.com.uvk.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements ClienteService{
    
    @Autowired
    private ClienteRepository clienteRespository;

    @Override
    public List<Cliente> findAll() {
        return clienteRespository.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(long id) {

        return clienteRespository.findById(id);
    }

    @Override
    public Cliente add(Cliente c) {
        
        return clienteRespository.save(c);
    }

    @Override
    public Cliente update(Cliente c) {
        
        Cliente objcliente = clienteRespository.getById(c.getId_cliente());
        BeanUtils.copyProperties(c, objcliente);
		
        return clienteRespository.save(objcliente);
    }

    @Override
    public Cliente delete(Cliente c) {
        
        Cliente objcliente = clienteRespository.getById(c.getId_cliente());
        objcliente.setEstado(false);
		
        return clienteRespository.save(objcliente);
    }
}
