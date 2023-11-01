package sv.saraviasrent.www.entities;

import javax.persistence.*;

@Entity
@Table(name = "img_vehiculos", schema = "saravias_rentacar", catalog = "")
public class ImgVehiculos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "img_vehiculo_id", nullable = false, length = 12)
    private String imgVehiculoId;
    @Basic
    @Column(name = "img_vehiculo", nullable = false, length = -1)
    private String imgVehiculo;
    @Basic
    @Column(name = "vehiculo_id", nullable = false, length = 10)
    private String vehiculoId;
    @ManyToOne
    @JoinColumn(name = "vehiculo_id", referencedColumnName = "vehiculo_id", nullable = false)
    private Vehiculos vehiculosByVehiculoId;

    public String getImgVehiculoId() {
        return imgVehiculoId;
    }

    public void setImgVehiculoId(String imgVehiculoId) {
        this.imgVehiculoId = imgVehiculoId;
    }

    public String getImgVehiculo() {
        return imgVehiculo;
    }

    public void setImgVehiculo(String imgVehiculo) {
        this.imgVehiculo = imgVehiculo;
    }

    public String getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(String vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public Vehiculos getVehiculosByVehiculoId() {
        return vehiculosByVehiculoId;
    }

    public void setVehiculosByVehiculoId(Vehiculos vehiculosByVehiculoId) {
        this.vehiculosByVehiculoId = vehiculosByVehiculoId;
    }
}
