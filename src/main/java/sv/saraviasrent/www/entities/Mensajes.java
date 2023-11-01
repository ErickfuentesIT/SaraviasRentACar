package sv.saraviasrent.www.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Mensajes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "mensaje_id", nullable = false, length = 12)
    private String mensajeId;
    @Basic
    @Column(name = "mensaje", nullable = false, length = -1)
    private String mensaje;
    @Basic
    @Column(name = "emisor_mensaje", nullable = false, length = 6)
    private String emisorMensaje;
    @Basic
    @Column(name = "fecha_creacion", nullable = false)
    private Timestamp fechaCreacion;
    @Basic
    @Column(name = "conversacion_id", nullable = false, length = 10)
    private String conversacionId;
    @Basic
    @Column(name = "estado", nullable = false)
    private Object estado;

    public String getMensajeId() {
        return mensajeId;
    }

    public void setMensajeId(String mensajeId) {
        this.mensajeId = mensajeId;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEmisorMensaje() {
        return emisorMensaje;
    }

    public void setEmisorMensaje(String emisorMensaje) {
        this.emisorMensaje = emisorMensaje;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getConversacionId() {
        return conversacionId;
    }

    public void setConversacionId(String conversacionId) {
        this.conversacionId = conversacionId;
    }

    public Object getEstado() {
        return estado;
    }

    public void setEstado(Object estado) {
        this.estado = estado;
    }
}
