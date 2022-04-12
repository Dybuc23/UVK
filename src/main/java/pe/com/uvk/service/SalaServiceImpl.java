package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.uvk.entity.Sala;
import pe.com.uvk.repository.SalaRepository;

@Service
public class SalaServiceImpl implements SalaService{

    @Autowired
    private SalaRepository salaRepository;
    @Override
    public List<Sala> findAll() {
        return salaRepository.findAllCustom();
    }

    @Override
    public Optional<Sala> findById(long id) {
        return salaRepository.findById(id);
    }

    @Override
    public Sala add(Sala s) {
        return salaRepository.save(s);
    }

    @Override
    public Sala update(Sala s) {
        Sala objsala = salaRepository.getById(s.getId_sala());
        BeanUtils.copyProperties(s, objsala);
        return salaRepository.save(objsala);
    }

    @Override
    public Sala delete(Sala s) {
        Sala objsala = salaRepository.getById(s.getId_sala());
        objsala.setEstado(false);
        return salaRepository.save(objsala);
    }
    
}
