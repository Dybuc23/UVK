package pe.com.uvk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

@Builder
@Entity(name = "Sala")
@Table(name = "sala")
public class Sala {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_sala")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_sala;
    @Column(name = "total_asiento")
    private int total_asiento;
    @Column(name = "estado")
    private boolean estado;

    public Sala() {
    }

    public Sala(long id_sala, int total_asiento, boolean estado) {
        this.id_sala = id_sala;
        this.total_asiento = total_asiento;
        this.estado = estado;
    }

    public long getId_sala() {
        return id_sala;
    }

    public void setId_sala(long id_sala) {
        this.id_sala = id_sala;
    }

    public int getTotal_asiento() {
        return total_asiento;
    }

    public void setTotal_asiento(int total_asiento) {
        this.total_asiento = total_asiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
