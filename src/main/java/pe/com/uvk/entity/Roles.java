package pe.com.uvk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

@Builder
@Entity(name = "Roles")
@Table(name = "roles")
public class Roles {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_rol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_rol;
    @Column(name = "nom_rol")
    private String nom_rol;
    @Column(name = "estado")
    private boolean estado;

    public Roles() {
    }

    public Roles(long id_rol, String nom_rol, boolean estado) {
        this.id_rol = id_rol;
        this.nom_rol = nom_rol;
        this.estado = estado;
    }

    public long getId_rol() {
        return id_rol;
    }

    public void setId_rol(long id_rol) {
        this.id_rol = id_rol;
    }

    public String getNom_rol() {
        return nom_rol;
    }

    public void setNom_rol(String nom_rol) {
        this.nom_rol = nom_rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
