package pe.com.uvk.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.uvk.entity.Sala;


public interface SalaRepository extends JpaRepository<Sala, Long>{
    
    @Query("select s from Sala s where s.estado='1'")
    List<Sala> findAllCustom();
}
