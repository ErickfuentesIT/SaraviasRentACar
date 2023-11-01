package sv.saraviasrent.www.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Clientes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cliente_id", nullable = false, length = 6)
    private String clienteId;
    @Basic
    @Column(name = "usuario_cliente", nullable = false, length = 5)
    private String usuarioCliente;
    @Basic
    @Column(name = "foto_cli", nullable = false, length = -1)
    private String fotoCli;
    @Basic
    @Column(name = "nombres_cli", nullable = false, length = 255)
    private String nombresCli;
    @Basic
    @Column(name = "apellidos_cli", nullable = false, length = 255)
    private String apellidosCli;
    @Basic
    @Column(name = "telefono_cli", nullable = false, length = 10)
    private String telefonoCli;
    @Basic
    @Column(name = "direccion_cli", nullable = false, length = -1)
    private String direccionCli;
    @Basic
    @Column(name = "dui_cli", nullable = false, length = 11)
    private String duiCli;
    @Basic
    @Column(name = "fecha_creacion_cli", nullable = false)
    private Timestamp fechaCreacionCli;
    @Basic
    @Column(name = "estado_cli", nullable = false)
    private Object estadoCli;
    @ManyToOne
    @JoinColumn(name = "usuario_cliente", referencedColumnName = "usuario_id", nullable = false)
    private Usuarios usuariosByUsuarioCliente;
    @OneToMany(mappedBy = "clientesByUsuarioConv")
    private Collection<Conversaciones> conversacionesByClienteId;
    @OneToMany(mappedBy = "clientesByEmisorMensaje")
    private Collection<Mensajes> mensajesByClienteId;

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getUsuarioCliente() {
        return usuarioCliente;
    }

    public void setUsuarioCliente(String usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }

    public String getFotoCli() {
        return fotoCli;
    }

    public void setFotoCli(String fotoCli) {
        this.fotoCli = fotoCli;
    }

    public String getNombresCli() {
        return nombresCli;
    }

    public void setNombresCli(String nombresCli) {
        this.nombresCli = nombresCli;
    }

    public String getApellidosCli() {
        return apellidosCli;
    }

    public void setApellidosCli(String apellidosCli) {
        this.apellidosCli = apellidosCli;
    }

    public String getTelefonoCli() {
        return telefonoCli;
    }

    public void setTelefonoCli(String telefonoCli) {
        this.telefonoCli = telefonoCli;
    }

    public String getDireccionCli() {
        return direccionCli;
    }

    public void setDireccionCli(String direccionCli) {
        this.direccionCli = direccionCli;
    }

    public String getDuiCli() {
        return duiCli;
    }

    public void setDuiCli(String duiCli) {
        this.duiCli = duiCli;
    }

    public Timestamp getFechaCreacionCli() {
        return fechaCreacionCli;
    }

    public void setFechaCreacionCli(Timestamp fechaCreacionCli) {
        this.fechaCreacionCli = fechaCreacionCli;
    }

    public Object getEstadoCli() {
        return estadoCli;
    }

    public void setEstadoCli(Object estadoCli) {
        this.estadoCli = estadoCli;
    }

    public Usuarios getUsuariosByUsuarioCliente() {
        return usuariosByUsuarioCliente;
    }

    public void setUsuariosByUsuarioCliente(Usuarios usuariosByUsuarioCliente) {
        this.usuariosByUsuarioCliente = usuariosByUsuarioCliente;
    }

    public Collection<Conversaciones> getConversacionesByClienteId() {
        return conversacionesByClienteId;
    }

    public void setConversacionesByClienteId(Collection<Conversaciones> conversacionesByClienteId) {
        this.conversacionesByClienteId = conversacionesByClienteId;
    }

    public Collection<Mensajes> getMensajesByClienteId() {
        return mensajesByClienteId;
    }

    public void setMensajesByClienteId(Collection<Mensajes> mensajesByClienteId) {
        this.mensajesByClienteId = mensajesByClienteId;
    }
}
