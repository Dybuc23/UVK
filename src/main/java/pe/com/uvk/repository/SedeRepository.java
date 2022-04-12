package pe.com.uvk.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.uvk.entity.Sede;


public interface SedeRepository extends JpaRepository<Sede, Long>{
    @Query("select s from Sede s where s.estado='1'")
    List<Sede> findAllCustom();
}
