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
@Entity(name = "Sede")
@Table(name = "sede")
public class Sede {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_sede")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_sede;
    @ManyToOne
    @JoinColumn(name="id_ciudad", nullable = false)
    private Ciudad ciudad;
    @Column(name = "nombre_sede")
    private String nombre_sede;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "estado")
    private boolean estado;

    public Sede() {
    }

    public Sede(long id_sede, Ciudad ciudad, String nombre_sede, String direccion, boolean estado) {
        this.id_sede = id_sede;
        this.ciudad = ciudad;
        this.nombre_sede = nombre_sede;
        this.direccion = direccion;
        this.estado = estado;
    }

    public long getId_sede() {
        return id_sede;
    }

    public void setId_sede(long id_sede) {
        this.id_sede = id_sede;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre_sede() {
        return nombre_sede;
    }

    public void setNombre_sede(String nombre_sede) {
        this.nombre_sede = nombre_sede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
