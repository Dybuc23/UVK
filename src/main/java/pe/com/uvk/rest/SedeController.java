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
import pe.com.uvk.entity.Sede;
import pe.com.uvk.service.SedeService;

@RestController
@RequestMapping("/sede")
public class SedeController {
    @Autowired
    private SedeService sedeService;

    @GetMapping
    public List<Sede> findAll(){
        return sedeService.findAll();
    }

    @PostMapping
    public Sede add(@RequestBody Sede s){
        return sedeService.add(s);
    }

    @GetMapping("/{id}")
    public Optional<Sede> findById(@PathVariable long id){
        return sedeService.findById(id);
    }

    @PutMapping("/{id}")
    public Sede update(@PathVariable long id,@RequestBody Sede s){
        s.setId_sede(id);
        return sedeService.update(s);
    }

    @DeleteMapping("/{id}")
    public Sede delete(@PathVariable long id){
        Sede objsede = new Sede();
        objsede.setId_sede(id);
        return sedeService.delete(Sede.builder().id_sede(id).build());
    }
}
