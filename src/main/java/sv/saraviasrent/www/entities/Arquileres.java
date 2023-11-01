package sv.saraviasrent.www.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
public class Arquileres {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "arquiler_id", nullable = false, length = 10)
    private String arquilerId;
    @Basic
    @Column(name = "vehiculo_id", nullable = false, length = 10)
    private String vehiculoId;
    @Basic
    @Column(name = "titulo_arquiler", nullable = false, length = 100)
    private String tituloArquiler;
    @Basic
    @Column(name = "descripcion_arquiler", nullable = false, length = -1)
    private String descripcionArquiler;
    @Basic
    @Column(name = "precio_arquiler", nullable = false, precision = 2)
    private BigDecimal precioArquiler;
    @Basic
    @Column(name = "estado_arquiler", nullable = false)
    private Object estadoArquiler;
    @Basic
    @Column(name = "gestor_id", nullable = false, length = 10)
    private String gestorId;
    @ManyToOne
    @JoinColumn(name = "vehiculo_id", referencedColumnName = "vehiculo_id", nullable = false)
    private Vehiculos vehiculosByVehiculoId;
    @ManyToOne
    @JoinColumn(name = "gestor_id", referencedColumnName = "empleado_id", nullable = false)
    private Empleados empleadosByGestorId;
    @OneToMany(mappedBy = "arquileresByPublicacionConv")
    private Collection<Conversaciones> conversacionesByArquilerId;

    public String getArquilerId() {
        return arquilerId;
    }

    public void setArquilerId(String arquilerId) {
        this.arquilerId = arquilerId;
    }

    public String getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(String vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public String getTituloArquiler() {
        return tituloArquiler;
    }

    public void setTituloArquiler(String tituloArquiler) {
        this.tituloArquiler = tituloArquiler;
    }

    public String getDescripcionArquiler() {
        return descripcionArquiler;
    }

    public void setDescripcionArquiler(String descripcionArquiler) {
        this.descripcionArquiler = descripcionArquiler;
    }

    public BigDecimal getPrecioArquiler() {
        return precioArquiler;
    }

    public void setPrecioArquiler(BigDecimal precioArquiler) {
        this.precioArquiler = precioArquiler;
    }

    public Object getEstadoArquiler() {
        return estadoArquiler;
    }

    public void setEstadoArquiler(Object estadoArquiler) {
        this.estadoArquiler = estadoArquiler;
    }

    public String getGestorId() {
        return gestorId;
    }

    public void setGestorId(String gestorId) {
        this.gestorId = gestorId;
    }

    public Vehiculos getVehiculosByVehiculoId() {
        return vehiculosByVehiculoId;
    }

    public void setVehiculosByVehiculoId(Vehiculos vehiculosByVehiculoId) {
        this.vehiculosByVehiculoId = vehiculosByVehiculoId;
    }

    public Empleados getEmpleadosByGestorId() {
        return empleadosByGestorId;
    }

    public void setEmpleadosByGestorId(Empleados empleadosByGestorId) {
        this.empleadosByGestorId = empleadosByGestorId;
    }

    public Collection<Conversaciones> getConversacionesByArquilerId() {
        return conversacionesByArquilerId;
    }

    public void setConversacionesByArquilerId(Collection<Conversaciones> conversacionesByArquilerId) {
        this.conversacionesByArquilerId = conversacionesByArquilerId;
    }
}
