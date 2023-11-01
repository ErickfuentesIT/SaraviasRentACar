package sv.saraviasrent.www.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
public class Vehiculos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "vehiculo_id", nullable = false, length = 10)
    private String vehiculoId;
    @Basic
    @Column(name = "marca_vehiculo", nullable = false, length = 50)
    private String marcaVehiculo;
    @Basic
    @Column(name = "modelo_vehiculo", nullable = false, length = 50)
    private String modeloVehiculo;
    @Basic
    @Column(name = "año_vehiculo", nullable = false)
    private int añoVehiculo;
    @Basic
    @Column(name = "tipo_vehiculo", nullable = false)
    private Object tipoVehiculo;
    @Basic
    @Column(name = "color_vehiculo", nullable = false, length = 20)
    private String colorVehiculo;
    @Basic
    @Column(name = "estado_vehiculo", nullable = false)
    private Object estadoVehiculo;
    @Basic
    @Column(name = "placa_vehiculo", nullable = false, length = 20)
    private String placaVehiculo;
    @Basic
    @Column(name = "propietario_vehiculo", nullable = false, length = 6)
    private String propietarioVehiculo;
    @Basic
    @Column(name = "motor_vehiculo", nullable = false, length = 50)
    private String motorVehiculo;
    @Basic
    @Column(name = "consumo_vehiculo", nullable = false, length = 50)
    private String consumoVehiculo;
    @Basic
    @Column(name = "fecha_creacion", nullable = false)
    private Timestamp fechaCreacion;
    @OneToMany(mappedBy = "vehiculosByVehiculoId")
    private Collection<Ventas> ventasByVehiculoId;

    public String getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(String vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public int getAñoVehiculo() {
        return añoVehiculo;
    }

    public void setAñoVehiculo(int añoVehiculo) {
        this.añoVehiculo = añoVehiculo;
    }

    public Object getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(Object tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public Object getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(Object estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getPropietarioVehiculo() {
        return propietarioVehiculo;
    }

    public void setPropietarioVehiculo(String propietarioVehiculo) {
        this.propietarioVehiculo = propietarioVehiculo;
    }

    public String getMotorVehiculo() {
        return motorVehiculo;
    }

    public void setMotorVehiculo(String motorVehiculo) {
        this.motorVehiculo = motorVehiculo;
    }

    public String getConsumoVehiculo() {
        return consumoVehiculo;
    }

    public void setConsumoVehiculo(String consumoVehiculo) {
        this.consumoVehiculo = consumoVehiculo;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Collection<Ventas> getVentasByVehiculoId() {
        return ventasByVehiculoId;
    }

    public void setVentasByVehiculoId(Collection<Ventas> ventasByVehiculoId) {
        this.ventasByVehiculoId = ventasByVehiculoId;
    }
}
