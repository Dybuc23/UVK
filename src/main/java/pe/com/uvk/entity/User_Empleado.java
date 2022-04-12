package pe.com.uvk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Builder;

@Builder
@Entity(name = "User_Empleado")
@Table(name = "user_empleado")
public class User_Empleado {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_user;
    @ManyToOne
    @JoinColumn(name="id_empleado", nullable = false)
    private Empleado empleado;
    @ManyToOne
    @JoinColumn(name="id_rol", nullable = false)
    private Roles roles;
    @Column(name = "contraseña")
    private String contraseña;
    @Column(name = "estado")
    private boolean estado;

    public User_Empleado() {
    }

    public User_Empleado(long id_user, Empleado empleado, Roles roles, String contraseña, boolean estado) {
        this.id_user = id_user;
        this.empleado = empleado;
        this.roles = roles;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
