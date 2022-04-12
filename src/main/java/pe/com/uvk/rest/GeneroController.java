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
import pe.com.uvk.entity.Genero;
import pe.com.uvk.service.GeneroService;


@RestController
@RequestMapping("/genero")
public class GeneroController {
    
    @Autowired
    private GeneroService generoService;
    
    @GetMapping
    public List<Genero> findAll(){
        return generoService.findAll();
    }
    
    @PostMapping
    public Genero add(@RequestBody Genero g){
        return generoService.add(g);
    }
    
    @GetMapping("/{id}")
    public Optional<Genero> findById(@PathVariable long id){
        return generoService.findById(id);
    }
    
    @PutMapping("/{id}")
    public Genero update(@PathVariable long id, @RequestBody Genero c){
        c.setId_genpeli(id);
        return generoService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public Genero delete(@PathVariable long id){
        Genero objgenero = new Genero();
        objgenero.setId_genpeli(id);
        
        return generoService.delete(Genero.builder().id_genpeli(id).build());
    }
}
