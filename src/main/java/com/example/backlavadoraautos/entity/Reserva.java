package com.example.backlavadoraautos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "RESERVA")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RESERVA")
    private Integer idReserva;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "FECHA")
    private Date fecha;
    @Column(name = "ESTADO_RESERVA")
    private Boolean estadoReserva;
    /*@ManyToOne
    @JoinColumn(name = "ID_SUCURSAL")
    private TbaSucursal idSucursal;
    @ManyToOne
    @JoinColumn(name = "ID_PERSONA")
    private TbaPersona idPersona;*/
}