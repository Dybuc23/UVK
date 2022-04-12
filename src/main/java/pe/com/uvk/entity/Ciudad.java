package pe.com.uvk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

@Builder
@Entity(name = "Ciudad")
@Table(name = "ciudad")
public class Ciudad {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_ciudad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_ciudad;
    @Column(name = "nombre_ciu")
    private String nombre_ciu;
    @Column(name = "estado")
    private boolean estado;

    public Ciudad() {
    }

    public Ciudad(long id_ciudad, String nombre_ciu, boolean estado) {
        this.id_ciudad = id_ciudad;
        this.nombre_ciu = nombre_ciu;
        this.estado = estado;
    }

    public long getId_ciudad() {
        return id_ciudad;
    }

    public void setId_ciudad(long id_ciudad) {
        this.id_ciudad = id_ciudad;
    }

    public String getNombre_ciu() {
        return nombre_ciu;
    }

    public void setNombre_ciu(String nombre_ciu) {
        this.nombre_ciu = nombre_ciu;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
