package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.uvk.entity.Asiento;
import pe.com.uvk.repository.AsientoRepository;

@Service
public class AsientoServiceImp implements AsientoService{

    @Autowired
    private AsientoRepository asientoRepository;
    
    @Override
    public List<Asiento> findAll() {
        return asientoRepository.findAllCustom();
    }

    @Override
    public Optional<Asiento> findById(long id) {
        return asientoRepository.findById(id);
    }

    @Override
    public Asiento add(Asiento a) {
        return asientoRepository.save(a);
    }

    @Override
    public Asiento update(Asiento a) {
        Asiento objasiento = asientoRepository.getById(a.getId_asiento());
        BeanUtils.copyProperties(a, objasiento);
        return asientoRepository.save(objasiento);
    }

    @Override
    public Asiento delete(Asiento a) {
        Asiento objasiento = asientoRepository.getById(a.getId_asiento());
        objasiento.setEstado(3);
        
        return asientoRepository.save(objasiento);
    }
    
}
