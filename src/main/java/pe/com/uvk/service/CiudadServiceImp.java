package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.uvk.entity.Ciudad;
import pe.com.uvk.repository.CiudadRepository;

@Service
public class CiudadServiceImp implements CiudadService{

    @Autowired
    private CiudadRepository ciudadRepository;
    @Override
    public List<Ciudad> findAll() {
        return ciudadRepository.findAllCustom();
    }

    @Override
    public Optional<Ciudad> findById(long id) {
        return ciudadRepository.findById(id);
    }

    @Override
    public Ciudad add(Ciudad c) {
        return ciudadRepository.save(c);
    }

    @Override
    public Ciudad update(Ciudad c) {
        Ciudad objciudad = ciudadRepository.getById(c.getId_ciudad());
        BeanUtils.copyProperties(c, objciudad);
        return ciudadRepository.save(objciudad);
    }

    @Override
    public Ciudad delete(Ciudad c) {
        Ciudad objciudad = ciudadRepository.getById(c.getId_ciudad());
        objciudad.setEstado(false);
        return ciudadRepository.save(objciudad);
    }
    
}
