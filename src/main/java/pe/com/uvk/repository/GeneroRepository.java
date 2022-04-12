package pe.com.uvk.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.uvk.entity.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long>{
    
    @Query("select g from Genero g where g.estado='1'")
    List<Genero> findAllCustom();
}
