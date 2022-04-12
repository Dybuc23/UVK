/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.uvk.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.uvk.entity.User_Empleado;

/**
 *
 * @author User
 */
public interface User_EmpleadoRepository extends JpaRepository<User_Empleado, Long>{
    @Query("select u from User_Empleado u where u.estado='1'")
    List<User_Empleado> findAllCustom();
}
