package sv.saraviasrent.www.entities;

import javax.persistence.*;

@Entity
public class Usuarios {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "usuario_id", nullable = false, length = 5)
    private String usuarioId;
    @Basic
    @Column(name = "username", nullable = false, length = 100)
    private String username;
    @Basic
    @Column(name = "correo_user", nullable = false, length = 255)
    private String correoUser;
    @Basic
    @Column(name = "contrasena_user", nullable = false, length = 255)
    private String contrasenaUser;
    @Basic
    @Column(name = "rol_id", nullable = false, length = 5)
    private String rolId;
    @Basic
    @Column(name = "estado_user", nullable = false)
    private Object estadoUser;

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreoUser() {
        return correoUser;
    }

    public void setCorreoUser(String correoUser) {
        this.correoUser = correoUser;
    }

    public String getContrasenaUser() {
        return contrasenaUser;
    }

    public void setContrasenaUser(String contrasenaUser) {
        this.contrasenaUser = contrasenaUser;
    }

    public String getRolId() {
        return rolId;
    }

    public void setRolId(String rolId) {
        this.rolId = rolId;
    }

    public Object getEstadoUser() {
        return estadoUser;
    }

    public void setEstadoUser(Object estadoUser) {
        this.estadoUser = estadoUser;
    }
}
