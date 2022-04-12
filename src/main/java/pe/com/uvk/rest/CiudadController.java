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
import pe.com.uvk.entity.Ciudad;
import pe.com.uvk.service.CiudadService;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {
    @Autowired
    private CiudadService ciudadService;
    
    @GetMapping
    public List<Ciudad> findAll(){
        return ciudadService.findAll();
    }
    
    @PostMapping
    public Ciudad add(@RequestBody Ciudad c){
        return ciudadService.add(c);
    }
    
    @GetMapping("/{id}")
    public Optional<Ciudad> findById(@PathVariable long id){
        return ciudadService.findById(id);
    }
    
    @PutMapping("/{id}")
    public Ciudad update(@PathVariable long id,@RequestBody Ciudad c){
        c.setId_ciudad(id);
        return ciudadService.update(c);
    }
    
    @DeleteMapping("/{id}")
    public Ciudad delete(@PathVariable long id){
        Ciudad objciudad = new Ciudad();
        objciudad.setId_ciudad(id);
        return ciudadService.delete(Ciudad.builder().id_ciudad(id).build());
    }
}
