package com.example.backlavadoraautos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "ESTADO_CLIENTE")
    private Boolean estadoCliente;
    @Column(name = "NOMBRE")
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;
    /*@ManyToOne
    @JoinColumn(name = "ID_PERSONA")
    private TbaPersona idPersona;*/
}