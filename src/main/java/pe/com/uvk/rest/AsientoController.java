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
import pe.com.uvk.entity.Asiento;
import pe.com.uvk.service.AsientoService;

@RestController
@RequestMapping("/asiento")
public class AsientoController {
    
    @Autowired
    private AsientoService asientoService;
    
    @GetMapping
    public List<Asiento> findAll(){
        return asientoService.findAll();
    }
    
    @PostMapping
    public Asiento add(@RequestBody Asiento a){
        return asientoService.add(a);
    }
    
    @GetMapping("/{id}")
    public Optional<Asiento> findById(@PathVariable long id){
        return asientoService.findById(id);
    }
    
    @PutMapping("/{id}")
    public Asiento update(@PathVariable long id, @RequestBody Asiento a){
        a.setId_asiento(id);
        return asientoService.update(a);
    }
    
    @DeleteMapping("/{id}")
    public Asiento delete(@PathVariable long id){
        Asiento objasiento = new Asiento();
        objasiento.setId_asiento(id);
        
        return asientoService.delete(Asiento.builder().id_asiento(id).build());
    }
}
