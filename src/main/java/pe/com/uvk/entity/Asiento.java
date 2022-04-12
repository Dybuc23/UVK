/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@Entity(name = "Asiento")
@Table(name = "asiento")
public class Asiento {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_asiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_asiento;
    @ManyToOne
    @JoinColumn(name="id_sala", nullable = false)
    private Sala sala;
    @Column(name = "estado")
    private int estado;

    public Asiento() {
    }

    public Asiento(long id_asiento, Sala sala, int estado) {
        this.id_asiento = id_asiento;
        this.sala = sala;
        this.estado = estado;
    }

    public long getId_asiento() {
        return id_asiento;
    }

    public void setId_asiento(long id_asiento) {
        this.id_asiento = id_asiento;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
