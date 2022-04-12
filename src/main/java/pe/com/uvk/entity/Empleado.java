package pe.com.uvk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;

@Builder
@Entity(name = "Empleado")
@Table(name = "empleado")
public class Empleado {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_empleado;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "tipo_documento")
    private String tipo_documento;
    @Column(name = "num_documento")
    private String num_documento;
    @Column(name = "f_nacimiento")
    private String f_nacimiento;
    @Column(name = "sexo_emp")
    private String sexo_cli;
    @Column(name = "edad_emp")
    private String edad_emp;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "celular")
    private int celular;
    @Column(name = "email")
    private String email;
    @Column(name = "departamento")
    private String departamento;
    @Column(name = "provincia")
    private String provincia;
    @Column(name = "distrito")
    private String distrito;
    @Column(name = "estado")
    private boolean estado;

    public Empleado() {
    }

    public Empleado(long id_empleado, String nombre, String apellido, String tipo_documento, String num_documento, String f_nacimiento, String sexo_cli, String edad_emp, String direccion, int celular, String email, String departamento, String provincia, String distrito, boolean estado) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_documento = tipo_documento;
        this.num_documento = num_documento;
        this.f_nacimiento = f_nacimiento;
        this.sexo_cli = sexo_cli;
        this.edad_emp = edad_emp;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.estado = estado;
    }

    

    public long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getSexo_cli() {
        return sexo_cli;
    }

    public void setSexo_cli(String sexo_cli) {
        this.sexo_cli = sexo_cli;
    }

    public String getEdad_emp() {
        return edad_emp;
    }

    public void setEdad_emp(String edad_emp) {
        this.edad_emp = edad_emp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
