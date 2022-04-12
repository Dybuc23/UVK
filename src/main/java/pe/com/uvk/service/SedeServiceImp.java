package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.uvk.entity.Sede;
import pe.com.uvk.repository.SedeRepository;

@Service
public class SedeServiceImp implements SedeService{
    
    @Autowired
    private SedeRepository sedeRepository;

    @Override
    public List<Sede> findAll() {
        return sedeRepository.findAllCustom();
    }

    @Override
    public Optional<Sede> findById(long id) {
        return sedeRepository.findById(id);
    }

    @Override
    public Sede add(Sede s) {
        return sedeRepository.save(s);
    }

    @Override
    public Sede update(Sede s) {
        Sede objsede = sedeRepository.getById(s.getId_sede());
        BeanUtils.copyProperties(s, objsede);
        return sedeRepository.save(objsede);
    }

    @Override
    public Sede delete(Sede s) {
        Sede objsede = sedeRepository.getById(s.getId_sede());
        objsede.setEstado(false);
        return sedeRepository.save(objsede);
    }
    
}
