package sv.saraviasrent.www.entities;

import javax.persistence.*;

@Entity
public class Ventas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "venta_id", nullable = false, length = 10)
    private String ventaId;
    @Basic
    @Column(name = "vehiculo_id", nullable = false, length = 10)
    private String vehiculoId;
    @Basic
    @Column(name = "titulo_venta", nullable = false, length = 100)
    private String tituloVenta;
    @Basic
    @Column(name = "descripcion_venta", nullable = false, length = 100)
    private String descripcionVenta;
    @Basic
    @Column(name = "precio_venta", nullable = false, length = 255)
    private String precioVenta;
    @Basic
    @Column(name = "estado_venta", nullable = false)
    private Object estadoVenta;
    @Basic
    @Column(name = "gestor_id", nullable = false, length = 6)
    private String gestorId;

    public String getVentaId() {
        return ventaId;
    }

    public void setVentaId(String ventaId) {
        this.ventaId = ventaId;
    }

    public String getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(String vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public String getTituloVenta() {
        return tituloVenta;
    }

    public void setTituloVenta(String tituloVenta) {
        this.tituloVenta = tituloVenta;
    }

    public String getDescripcionVenta() {
        return descripcionVenta;
    }

    public void setDescripcionVenta(String descripcionVenta) {
        this.descripcionVenta = descripcionVenta;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Object getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(Object estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    public String getGestorId() {
        return gestorId;
    }

    public void setGestorId(String gestorId) {
        this.gestorId = gestorId;
    }
}
