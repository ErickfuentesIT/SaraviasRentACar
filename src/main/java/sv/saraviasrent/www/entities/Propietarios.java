package sv.saraviasrent.www.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Propietarios {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "propietario_id", nullable = false, length = 6)
    private String propietarioId;
    @Basic
    @Column(name = "usuario_propietario", nullable = false, length = 5)
    private String usuarioPropietario;
    @Basic
    @Column(name = "foto_prop", nullable = false, length = -1)
    private String fotoProp;
    @Basic
    @Column(name = "nombres_prop", nullable = false, length = 255)
    private String nombresProp;
    @Basic
    @Column(name = "apellidos_prop", nullable = false, length = 255)
    private String apellidosProp;
    @Basic
    @Column(name = "telefono_prop", nullable = false, length = 10)
    private String telefonoProp;
    @Basic
    @Column(name = "dui_prop", nullable = false, length = 11)
    private String duiProp;
    @Basic
    @Column(name = "direccion_prop", nullable = false, length = -1)
    private String direccionProp;
    @Basic
    @Column(name = "fecha_creacion_prop", nullable = false)
    private Timestamp fechaCreacionProp;
    @Basic
    @Column(name = "gestor_id", nullable = false, length = 6)
    private String gestorId;
    @Basic
    @Column(name = "estado_prop", nullable = false)
    private Object estadoProp;
    @OneToMany(mappedBy = "propietariosByEmisorMensaje")
    private Collection<Mensajes> mensajesByPropietarioId;
    @ManyToOne
    @JoinColumn(name = "usuario_propietario", referencedColumnName = "usuario_id", nullable = false)
    private Usuarios usuariosByUsuarioPropietario;
    @OneToMany(mappedBy = "propietariosByPropietarioVehiculo")
    private Collection<Vehiculos> vehiculosByPropietarioId;

    public String getPropietarioId() {
        return propietarioId;
    }

    public void setPropietarioId(String propietarioId) {
        this.propietarioId = propietarioId;
    }

    public String getUsuarioPropietario() {
        return usuarioPropietario;
    }

    public void setUsuarioPropietario(String usuarioPropietario) {
        this.usuarioPropietario = usuarioPropietario;
    }

    public String getFotoProp() {
        return fotoProp;
    }

    public void setFotoProp(String fotoProp) {
        this.fotoProp = fotoProp;
    }

    public String getNombresProp() {
        return nombresProp;
    }

    public void setNombresProp(String nombresProp) {
        this.nombresProp = nombresProp;
    }

    public String getApellidosProp() {
        return apellidosProp;
    }

    public void setApellidosProp(String apellidosProp) {
        this.apellidosProp = apellidosProp;
    }

    public String getTelefonoProp() {
        return telefonoProp;
    }

    public void setTelefonoProp(String telefonoProp) {
        this.telefonoProp = telefonoProp;
    }

    public String getDuiProp() {
        return duiProp;
    }

    public void setDuiProp(String duiProp) {
        this.duiProp = duiProp;
    }

    public String getDireccionProp() {
        return direccionProp;
    }

    public void setDireccionProp(String direccionProp) {
        this.direccionProp = direccionProp;
    }

    public Timestamp getFechaCreacionProp() {
        return fechaCreacionProp;
    }

    public void setFechaCreacionProp(Timestamp fechaCreacionProp) {
        this.fechaCreacionProp = fechaCreacionProp;
    }

    public String getGestorId() {
        return gestorId;
    }

    public void setGestorId(String gestorId) {
        this.gestorId = gestorId;
    }

    public Object getEstadoProp() {
        return estadoProp;
    }

    public void setEstadoProp(Object estadoProp) {
        this.estadoProp = estadoProp;
    }

    public Collection<Mensajes> getMensajesByPropietarioId() {
        return mensajesByPropietarioId;
    }

    public void setMensajesByPropietarioId(Collection<Mensajes> mensajesByPropietarioId) {
        this.mensajesByPropietarioId = mensajesByPropietarioId;
    }

    public Usuarios getUsuariosByUsuarioPropietario() {
        return usuariosByUsuarioPropietario;
    }

    public void setUsuariosByUsuarioPropietario(Usuarios usuariosByUsuarioPropietario) {
        this.usuariosByUsuarioPropietario = usuariosByUsuarioPropietario;
    }

    public Collection<Vehiculos> getVehiculosByPropietarioId() {
        return vehiculosByPropietarioId;
    }

    public void setVehiculosByPropietarioId(Collection<Vehiculos> vehiculosByPropietarioId) {
        this.vehiculosByPropietarioId = vehiculosByPropietarioId;
    }
}
