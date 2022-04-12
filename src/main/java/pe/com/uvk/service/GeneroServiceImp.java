package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.uvk.entity.Genero;
import pe.com.uvk.repository.GeneroRepository;

@Service
public class GeneroServiceImp implements GeneroService{

    @Autowired
    private GeneroRepository generoRepository;
    
    @Override
    public List<Genero> findAll() {
        
        return generoRepository.findAllCustom();
    }

    @Override
    public Optional<Genero> findById(long id) {

        return generoRepository.findById(id);
    }

    @Override
    public Genero add(Genero c) {

        return generoRepository.save(c);
    }

    @Override
    public Genero update(Genero c) {

        Genero objgenero = generoRepository.getById(c.getId_genpeli());
        BeanUtils.copyProperties(c, objgenero);
		
        return generoRepository.save(objgenero);
    }

    @Override
    public Genero delete(Genero c) {
        
        Genero objgenero = generoRepository.getById(c.getId_genpeli());
        objgenero.setEstado(false);
        
        return generoRepository.save(objgenero);
    }
    
}
