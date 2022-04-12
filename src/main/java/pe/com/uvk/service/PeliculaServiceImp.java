package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.uvk.entity.Pelicula;
import pe.com.uvk.repository.PeliculaRepository;

@Service
public class PeliculaServiceImp implements PeliculaService{
    
    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> findAll() {

        return peliculaRepository.findAllCustom();
    }

    @Override
    public Optional<Pelicula> findById(long id) {

        return peliculaRepository.findById(id);
    }

    @Override
    public Pelicula add(Pelicula p) {

        return peliculaRepository.save(p);
    }

    @Override
    public Pelicula update(Pelicula p) {
        
        Pelicula objpelicula = peliculaRepository.getById(p.getId_pelicula());
        BeanUtils.copyProperties(p, objpelicula);
		
        return peliculaRepository.save(objpelicula);
    }

    @Override
    public Pelicula delete(Pelicula p) {
        
        Pelicula objpelicula = peliculaRepository.getById(p.getId_pelicula());
        objpelicula.setEstado(false);
        
        return peliculaRepository.save(objpelicula);
    }
    
    
}
