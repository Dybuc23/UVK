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
import pe.com.uvk.entity.Roles;
import pe.com.uvk.service.RolesService;

@RestController
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    private RolesService rolesService;
    
    @GetMapping
    public List<Roles> findAll(){
        return rolesService.findAll();
    }
    
    @PostMapping
    public Roles add(@RequestBody Roles r){
        return rolesService.add(r);
    }
    
    @GetMapping("/{id}")
    public Optional<Roles> findById(@PathVariable long id){
        return rolesService.findById(id);
    }
    
    @PutMapping("/{id}")
    public Roles update(@PathVariable long id, @RequestBody Roles r){
        r.setId_rol(id);
        return rolesService.update(r);
    }
    
    @DeleteMapping("/{id}")
    public Roles delete(@PathVariable long id){
        Roles objroles = new Roles();
        objroles.setId_rol(id);
        
        return rolesService.delete(Roles.builder().id_rol(id).build());
    }
}
