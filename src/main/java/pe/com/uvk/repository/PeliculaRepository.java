package pe.com.uvk.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.uvk.entity.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long>{
    
    @Query("select p from Pelicula p where p.estado='1'")
    List<Pelicula> findAllCustom();
}
