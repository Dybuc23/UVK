package pe.com.uvk.rest;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.uvk.entity.Pelicula;
import pe.com.uvk.service.PeliculaService;

@RestController
@RequestMapping("/pelicula")
public class PeliculaController {
    
    @Autowired
    private PeliculaService peliculaService;
    
    @GetMapping
    public List<Pelicula> findAll(){
        return peliculaService.findAll();
    }
    
    @PostMapping
    public Pelicula add(@RequestBody Pelicula p){
        return peliculaService.add(p);
    }
    
    @GetMapping("/{id}")
    public Optional<Pelicula> findById(@PathVariable long id){
        return peliculaService.findById(id);
    }
    
    @PutMapping("/{id}")
    public Pelicula update(@PathVariable long id, @RequestBody Pelicula p){
        p.setId_pelicula(id);
        return peliculaService.update(p);
    }
    
    @DeleteMapping("/{id}")
    public Pelicula delete(@PathVariable long id){
        Pelicula objpelicula = new Pelicula();
        objpelicula.setId_pelicula(id);
        
        return peliculaService.delete(Pelicula.builder().id_pelicula(id).build());
    }
}
