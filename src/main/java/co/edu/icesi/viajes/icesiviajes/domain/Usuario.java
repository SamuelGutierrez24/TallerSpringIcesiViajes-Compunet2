package co.edu.icesi.viajes.icesiviajes.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "id_usua")
    private Long idUsua;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "identificacion")
    private String identificacion;

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
}
