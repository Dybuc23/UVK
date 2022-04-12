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
import pe.com.uvk.entity.Sala;
import pe.com.uvk.service.SalaService;

@RestController
@RequestMapping("/sala")
public class SalaController {

    @Autowired
    private SalaService salaService;

    @GetMapping
    public List<Sala> findAll(){
        return salaService.findAll();
    }

    @PostMapping
    public Sala add(@RequestBody Sala s){
        return salaService.add(s);
    }

    @GetMapping("/{id}")
    public Optional<Sala> findById(@PathVariable long id){
        return salaService.findById(id);
    }

    @PutMapping("/{id}")
    public Sala update(@PathVariable long id,@RequestBody Sala s){
        s.setId_sala(id);
        return salaService.update(s);
    }

    @DeleteMapping("/{id}")
    public Sala delete(@PathVariable long id){
        Sala objsala = new Sala();
        objsala.setId_sala(id);
        return salaService.delete(Sala.builder().id_sala(id).build());
    }

}
