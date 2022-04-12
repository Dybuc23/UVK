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
import pe.com.uvk.entity.Empleado;
import pe.com.uvk.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping
    public List<Empleado> findAll(){
        return empleadoService.findAll();
    }

    @PostMapping
    public Empleado add(@RequestBody Empleado e){
        return empleadoService.add(e);
    }
    
    @GetMapping("/{id}")
    public Optional<Empleado> findById(@PathVariable long id){
        return empleadoService.findById(id);
    }
    
    @PutMapping("/{id}")
    public Empleado update(@PathVariable long id, @RequestBody Empleado e){
        e.setId_empleado(id);
        return empleadoService.update(e);
    }
    
    @DeleteMapping("/{id}")
    public Empleado delete(@PathVariable long id){
        Empleado objcliente = new Empleado();
        objcliente.setId_empleado(id);
        return empleadoService.delete(Empleado.builder().id_empleado(id).build());
        
        
    }
}
