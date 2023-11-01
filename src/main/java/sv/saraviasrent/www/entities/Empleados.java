package sv.saraviasrent.www.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Empleados {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "empleado_id", nullable = false, length = 6)
    private String empleadoId;
    @Basic
    @Column(name = "usuario_empleado", nullable = false, length = 5)
    private String usuarioEmpleado;
    @Basic
    @Column(name = "foto_emp", nullable = false, length = -1)
    private String fotoEmp;
    @Basic
    @Column(name = "nombres_emp", nullable = false, length = 255)
    private String nombresEmp;
    @Basic
    @Column(name = "apellidos_emp", nullable = false, length = 255)
    private String apellidosEmp;
    @Basic
    @Column(name = "telefono_emp", nullable = false, length = 10)
    private String telefonoEmp;
    @Basic
    @Column(name = "dui_emp", nullable = false, length = 11)
    private String duiEmp;
    @Basic
    @Column(name = "direccion_emp", nullable = false, length = -1)
    private String direccionEmp;
    @Basic
    @Column(name = "fecha_creacion_emp", nullable = false)
    private Timestamp fechaCreacionEmp;
    @Basic
    @Column(name = "creador_id", nullable = false, length = 6)
    private String creadorId;
    @Basic
    @Column(name = "estado_emp", nullable = false)
    private Object estadoEmp;
    @ManyToOne
    @JoinColumn(name = "usuario_empleado", referencedColumnName = "usuario_id", nullable = false)
    private Usuarios usuariosByUsuarioEmpleado;
    @OneToMany(mappedBy = "empleadosByEmisorMensaje")
    private Collection<Mensajes> mensajesByEmpleadoId;
    @OneToMany(mappedBy = "empleadosByGestorId")
    private Collection<Propietarios> propietariosByEmpleadoId;
    @OneToMany(mappedBy = "empleadosByGestorId")
    private Collection<Ventas> ventasByEmpleadoId;

    public String getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(String empleadoId) {
        this.empleadoId = empleadoId;
    }

    public String getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public void setUsuarioEmpleado(String usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public String getFotoEmp() {
        return fotoEmp;
    }

    public void setFotoEmp(String fotoEmp) {
        this.fotoEmp = fotoEmp;
    }

    public String getNombresEmp() {
        return nombresEmp;
    }

    public void setNombresEmp(String nombresEmp) {
        this.nombresEmp = nombresEmp;
    }

    public String getApellidosEmp() {
        return apellidosEmp;
    }

    public void setApellidosEmp(String apellidosEmp) {
        this.apellidosEmp = apellidosEmp;
    }

    public String getTelefonoEmp() {
        return telefonoEmp;
    }

    public void setTelefonoEmp(String telefonoEmp) {
        this.telefonoEmp = telefonoEmp;
    }

    public String getDuiEmp() {
        return duiEmp;
    }

    public void setDuiEmp(String duiEmp) {
        this.duiEmp = duiEmp;
    }

    public String getDireccionEmp() {
        return direccionEmp;
    }

    public void setDireccionEmp(String direccionEmp) {
        this.direccionEmp = direccionEmp;
    }

    public Timestamp getFechaCreacionEmp() {
        return fechaCreacionEmp;
    }

    public void setFechaCreacionEmp(Timestamp fechaCreacionEmp) {
        this.fechaCreacionEmp = fechaCreacionEmp;
    }

    public String getCreadorId() {
        return creadorId;
    }

    public void setCreadorId(String creadorId) {
        this.creadorId = creadorId;
    }

    public Object getEstadoEmp() {
        return estadoEmp;
    }

    public void setEstadoEmp(Object estadoEmp) {
        this.estadoEmp = estadoEmp;
    }

    public Usuarios getUsuariosByUsuarioEmpleado() {
        return usuariosByUsuarioEmpleado;
    }

    public void setUsuariosByUsuarioEmpleado(Usuarios usuariosByUsuarioEmpleado) {
        this.usuariosByUsuarioEmpleado = usuariosByUsuarioEmpleado;
    }

    public Collection<Mensajes> getMensajesByEmpleadoId() {
        return mensajesByEmpleadoId;
    }

    public void setMensajesByEmpleadoId(Collection<Mensajes> mensajesByEmpleadoId) {
        this.mensajesByEmpleadoId = mensajesByEmpleadoId;
    }

    public Collection<Propietarios> getPropietariosByEmpleadoId() {
        return propietariosByEmpleadoId;
    }

    public void setPropietariosByEmpleadoId(Collection<Propietarios> propietariosByEmpleadoId) {
        this.propietariosByEmpleadoId = propietariosByEmpleadoId;
    }

    public Collection<Ventas> getVentasByEmpleadoId() {
        return ventasByEmpleadoId;
    }

    public void setVentasByEmpleadoId(Collection<Ventas> ventasByEmpleadoId) {
        this.ventasByEmpleadoId = ventasByEmpleadoId;
    }
}
