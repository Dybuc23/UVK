package pe.com.uvk.entity;

import java.io.Serializable;
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
@Entity(name = "Pelicula")
@Table(name = "pelicula")
public class Pelicula implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id 
    @Column(name = "id_pelicula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_pelicula;
    @Column(name = "img_peli")
    private String img_peli;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "sipnosis")
    private String sipnosis;
    @Column(name = "duracion")
    private int duracion;
    @Column(name = "clasificacion")
    private String clasificacion;
    @Column(name = "estado")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="id_genpeli", nullable = false)
    private Genero genero;

    public Pelicula() {
    }

    public Pelicula(long id_pelicula, String img_peli, String nombre, String sipnosis, int duracion, String clasificacion, boolean estado, Genero genero) {
        this.id_pelicula = id_pelicula;
        this.img_peli = img_peli;
        this.nombre = nombre;
        this.sipnosis = sipnosis;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.estado = estado;
        this.genero = genero;
    }

    public long getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(long id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public String getImg_peli() {
        return img_peli;
    }

    public void setImg_peli(String img_peli) {
        this.img_peli = img_peli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSipnosis() {
        return sipnosis;
    }

    public void setSipnosis(String sipnosis) {
        this.sipnosis = sipnosis;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
    
}
