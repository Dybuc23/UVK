package pe.com.uvk.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.uvk.entity.Roles;
import pe.com.uvk.repository.RolesRepository;

@Service
public class RolesServiceImp implements RolesService{

    @Autowired
    private RolesRepository rolesRepository;
    @Override
    public List<Roles> findAll() {
        return rolesRepository.findAllCustom();
    }

    @Override
    public Optional<Roles> findById(long id) {
        return rolesRepository.findById(id);
    }

    @Override
    public Roles add(Roles r) {
        return rolesRepository.save(r);
    }

    @Override
    public Roles update(Roles r) {
        Roles objroles = rolesRepository.getById(r.getId_rol());
        BeanUtils.copyProperties(r, objroles);
        return rolesRepository.save(objroles);
    }

    @Override
    public Roles delete(Roles r) {
        Roles objroles = rolesRepository.getById(r.getId_rol());
        objroles.setEstado(false);
        return rolesRepository.save(objroles);
    }
    
}
