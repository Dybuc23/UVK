package pe.com.uvk.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.uvk.entity.Asiento;


public interface AsientoRepository extends JpaRepository<Asiento, Long>{
    @Query("select a from Asiento a where a.estado='1'")
    List<Asiento> findAllCustom();
}
