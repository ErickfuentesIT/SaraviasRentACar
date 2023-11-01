package sv.saraviasrent.www.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Conversaciones {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "conversaciones_id", nullable = false, length = 10)
    private String conversacionesId;
    @Basic
    @Column(name = "publicacion_conv", nullable = false, length = 10)
    private String publicacionConv;
    @Basic
    @Column(name = "empleado_conv", nullable = false, length = 6)
    private String empleadoConv;
    @Basic
    @Column(name = "usuario_conv", nullable = false, length = 6)
    private String usuarioConv;
    @Basic
    @Column(name = "fecha_creacion_conv", nullable = false)
    private Timestamp fechaCreacionConv;
    @Basic
    @Column(name = "estado_conv", nullable = false)
    private Object estadoConv;
    @ManyToOne
    @JoinColumn(name = "publicacion_conv", referencedColumnName = "venta_id", nullable = false)
    private Ventas ventasByPublicacionConv;
    @ManyToOne
    @JoinColumn(name = "empleado_conv", referencedColumnName = "empleado_id", nullable = false)
    private Empleados empleadosByEmpleadoConv;
    @ManyToOne
    @JoinColumn(name = "usuario_conv", referencedColumnName = "propietario_id", nullable = false)
    private Propietarios propietariosByUsuarioConv;
    @OneToMany(mappedBy = "conversacionesByConversacionId")
    private Collection<Mensajes> mensajesByConversacionesId;

    public String getConversacionesId() {
        return conversacionesId;
    }

    public void setConversacionesId(String conversacionesId) {
        this.conversacionesId = conversacionesId;
    }

    public String getPublicacionConv() {
        return publicacionConv;
    }

    public void setPublicacionConv(String publicacionConv) {
        this.publicacionConv = publicacionConv;
    }

    public String getEmpleadoConv() {
        return empleadoConv;
    }

    public void setEmpleadoConv(String empleadoConv) {
        this.empleadoConv = empleadoConv;
    }

    public String getUsuarioConv() {
        return usuarioConv;
    }

    public void setUsuarioConv(String usuarioConv) {
        this.usuarioConv = usuarioConv;
    }

    public Timestamp getFechaCreacionConv() {
        return fechaCreacionConv;
    }

    public void setFechaCreacionConv(Timestamp fechaCreacionConv) {
        this.fechaCreacionConv = fechaCreacionConv;
    }

    public Object getEstadoConv() {
        return estadoConv;
    }

    public void setEstadoConv(Object estadoConv) {
        this.estadoConv = estadoConv;
    }

    public Ventas getVentasByPublicacionConv() {
        return ventasByPublicacionConv;
    }

    public void setVentasByPublicacionConv(Ventas ventasByPublicacionConv) {
        this.ventasByPublicacionConv = ventasByPublicacionConv;
    }

    public Empleados getEmpleadosByEmpleadoConv() {
        return empleadosByEmpleadoConv;
    }

    public void setEmpleadosByEmpleadoConv(Empleados empleadosByEmpleadoConv) {
        this.empleadosByEmpleadoConv = empleadosByEmpleadoConv;
    }

    public Propietarios getPropietariosByUsuarioConv() {
        return propietariosByUsuarioConv;
    }

    public void setPropietariosByUsuarioConv(Propietarios propietariosByUsuarioConv) {
        this.propietariosByUsuarioConv = propietariosByUsuarioConv;
    }

    public Collection<Mensajes> getMensajesByConversacionesId() {
        return mensajesByConversacionesId;
    }

    public void setMensajesByConversacionesId(Collection<Mensajes> mensajesByConversacionesId) {
        this.mensajesByConversacionesId = mensajesByConversacionesId;
    }
}
