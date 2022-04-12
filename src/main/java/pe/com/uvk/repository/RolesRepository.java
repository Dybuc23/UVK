package pe.com.uvk.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.uvk.entity.Roles;


public interface RolesRepository extends JpaRepository<Roles, Long>{
    @Query("select r from Roles r where r.estado='1'")
    List<Roles> findAllCustom();
}
