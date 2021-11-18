package com.example.backlavadoraautos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USR")
    private Integer idUsr;
    /*@ManyToOne
    @JoinColumn(name = "ID_SUCURSAL")
    private TbaSucursal idSucursal;
    @ManyToOne
    @JoinColumn(name = "ID_PERSONA")
    private TbaPersona idPersona;*/
    @Column(name = "NICK_USR")
    private String nickUsr;
    @Column(name = "PASS_USR")
    private String passUsr;
    @Column(name = "TIPO_USR")
    private String tipoUsr;
    @Column(name = "ESTADO_USR")
    private Boolean estadoUsr;
}