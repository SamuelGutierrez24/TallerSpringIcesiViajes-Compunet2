package co.edu.icesi.viajes.icesiviajes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "detalle_plan")
public class DetallePlan {
    @Id
    @Column(name = "id_depl")
    private Long idDepl;

    @Column(name = "alimentacion")
    private String alimentacion;

    @Column(name = "hospedaje")
    private String hospedaje;

    @Column(name = "transporte")
    private String transporte;

    @Column(name = "traslados")
    private String traslados;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "cantidad_noches")
    private Integer cantidadNoches;

    @Column(name = "cantidad_dias")
    private Integer cantidadDias;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "usu_creador")
    private String usuCreador;

    @Column(name = "usu_modificador")
    private String usuModificador;

    @Column(name = "estado")
    private String estado;

    @Column(name = "id_plan")
    private Integer idPlan;

    @Column(name = "id_dest")
    private Integer idDest;
}
