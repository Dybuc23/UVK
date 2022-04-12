/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.uvk.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.uvk.entity.Ciudad;

/**
 *
 * @author User
 */
public interface CiudadRepository extends JpaRepository<Ciudad, Long>{
    
    @Query("select c from Ciudad c where c.estado='1'")
    List<Ciudad> findAllCustom();
    
}
