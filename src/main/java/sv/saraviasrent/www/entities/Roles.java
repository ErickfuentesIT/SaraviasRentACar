package sv.saraviasrent.www.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Roles {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rol_id", nullable = false, length = 5)
    private String rolId;
    @Basic
    @Column(name = "rol", nullable = false, length = 20)
    private String rol;
    @OneToMany(mappedBy = "rolesByRolId")
    private Collection<Usuarios> usuariosByRolId;

    public String getRolId() {
        return rolId;
    }

    public void setRolId(String rolId) {
        this.rolId = rolId;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Collection<Usuarios> getUsuariosByRolId() {
        return usuariosByRolId;
    }

    public void setUsuariosByRolId(Collection<Usuarios> usuariosByRolId) {
        this.usuariosByRolId = usuariosByRolId;
    }
}
