package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.uvk.entity.User_Empleado;
import pe.com.uvk.repository.User_EmpleadoRepository;

@Service
public class User_EmpleadoServiceImp implements User_EmpleadoService{

    @Autowired
    private User_EmpleadoRepository userempleadoRepository;
    @Override
    public List<User_Empleado> findAll() {
        return userempleadoRepository.findAllCustom();
    }

    @Override
    public Optional<User_Empleado> findById(long id) {
        return userempleadoRepository.findById(id);
    }

    @Override
    public User_Empleado add(User_Empleado u) {
        return userempleadoRepository.save(u);
    }

    @Override
    public User_Empleado update(User_Empleado u) {
        User_Empleado objuser = userempleadoRepository.getById(u.getId_user());
        BeanUtils.copyProperties(u, objuser);
        return userempleadoRepository.save(objuser);
    }

    @Override
    public User_Empleado delete(User_Empleado u) {
        User_Empleado objuser = userempleadoRepository.getById(u.getId_user());
        objuser.setEstado(false);
        return userempleadoRepository.save(objuser);
    }
    
}
