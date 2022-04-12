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
import pe.com.uvk.entity.User_Empleado;
import pe.com.uvk.service.User_EmpleadoService;

@RestController
@RequestMapping("/userempleado")
public class UserEmpleadoController {
    
    @Autowired 
    private User_EmpleadoService userempleadoservice;
    
    @GetMapping
    public List<User_Empleado> findAll(){
        return userempleadoservice.findAll();
    }

    @PostMapping
    public User_Empleado add(@RequestBody User_Empleado u){
        return userempleadoservice.add(u);
    }
    
    @GetMapping("/{id}")
    public Optional<User_Empleado> findById(@PathVariable long id){
        return userempleadoservice.findById(id);
    }
    
    @PutMapping("/{id}")
    public User_Empleado update(@PathVariable long id, @RequestBody User_Empleado u){
        u.setId_user(id);
        return userempleadoservice.update(u);
    }
    
    @DeleteMapping("/{id}")
    public User_Empleado delete(@PathVariable long id){
        User_Empleado objcliente = new User_Empleado();
        objcliente.setId_user(id);
        return userempleadoservice.delete(User_Empleado.builder().id_user(id).build());
        
    }
}
