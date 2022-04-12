package pe.com.uvk.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

@Builder
@Entity(name="Genero")
@Table(name = "genero_peli")
public class Genero implements Serializable{
    
    @Id
    @Column(name = "id_genpeli")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_genpeli;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "estado")
    private boolean estado;

    public Genero() {
    }
   
    public Genero(long id_genpeli, String nombre, boolean estado) {
        this.id_genpeli = id_genpeli;
        this.nombre = nombre;
        this.estado = estado;
    }

    public long getId_genpeli() {
        return id_genpeli;
    }

    public void setId_genpeli(long id_genpeli) {
        this.id_genpeli = id_genpeli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
           
}
