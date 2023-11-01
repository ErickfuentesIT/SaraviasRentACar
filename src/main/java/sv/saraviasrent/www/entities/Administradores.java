package sv.saraviasrent.www.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Administradores {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "administrador_id", nullable = false, length = 6)
    private String administradorId;
    @Basic
    @Column(name = "usuario_admin", nullable = false, length = 5)
    private String usuarioAdmin;
    @Basic
    @Column(name = "foto_admin", nullable = false, length = -1)
    private String fotoAdmin;
    @Basic
    @Column(name = "nombres_admin", nullable = false, length = 255)
    private String nombresAdmin;
    @Basic
    @Column(name = "apellidos_admin", nullable = false, length = 255)
    private String apellidosAdmin;
    @Basic
    @Column(name = "telefono_admin", nullable = false, length = 10)
    private String telefonoAdmin;
    @Basic
    @Column(name = "fecha_creacion_admin", nullable = false)
    private Timestamp fechaCreacionAdmin;
    @Basic
    @Column(name = "estado_admin", nullable = false)
    private Object estadoAdmin;
    @ManyToOne
    @JoinColumn(name = "usuario_admin", referencedColumnName = "usuario_id", nullable = false)
    private Usuarios usuariosByUsuarioAdmin;
    @OneToMany(mappedBy = "administradoresByCreadorId")
    private Collection<Empleados> empleadosByAdministradorId;

    public String getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(String administradorId) {
        this.administradorId = administradorId;
    }

    public String getUsuarioAdmin() {
        return usuarioAdmin;
    }

    public void setUsuarioAdmin(String usuarioAdmin) {
        this.usuarioAdmin = usuarioAdmin;
    }

    public String getFotoAdmin() {
        return fotoAdmin;
    }

    public void setFotoAdmin(String fotoAdmin) {
        this.fotoAdmin = fotoAdmin;
    }

    public String getNombresAdmin() {
        return nombresAdmin;
    }

    public void setNombresAdmin(String nombresAdmin) {
        this.nombresAdmin = nombresAdmin;
    }

    public String getApellidosAdmin() {
        return apellidosAdmin;
    }

    public void setApellidosAdmin(String apellidosAdmin) {
        this.apellidosAdmin = apellidosAdmin;
    }

    public String getTelefonoAdmin() {
        return telefonoAdmin;
    }

    public void setTelefonoAdmin(String telefonoAdmin) {
        this.telefonoAdmin = telefonoAdmin;
    }

    public Timestamp getFechaCreacionAdmin() {
        return fechaCreacionAdmin;
    }

    public void setFechaCreacionAdmin(Timestamp fechaCreacionAdmin) {
        this.fechaCreacionAdmin = fechaCreacionAdmin;
    }

    public Object getEstadoAdmin() {
        return estadoAdmin;
    }

    public void setEstadoAdmin(Object estadoAdmin) {
        this.estadoAdmin = estadoAdmin;
    }

    public Usuarios getUsuariosByUsuarioAdmin() {
        return usuariosByUsuarioAdmin;
    }

    public void setUsuariosByUsuarioAdmin(Usuarios usuariosByUsuarioAdmin) {
        this.usuariosByUsuarioAdmin = usuariosByUsuarioAdmin;
    }

    public Collection<Empleados> getEmpleadosByAdministradorId() {
        return empleadosByAdministradorId;
    }

    public void setEmpleadosByAdministradorId(Collection<Empleados> empleadosByAdministradorId) {
        this.empleadosByAdministradorId = empleadosByAdministradorId;
    }
}
