package com.example.backlavadoraautos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
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
    @Column(name = "TIPO_LAVADO")
    private String tipoLavado;
    @Column(name = "CAMBIO_ACEITE")
    private Boolean cambioAceite;
    @Column(name = "FECHA")
    private Date fecha;
    @Column(name = "ESTADO_RESERVA")
    private Boolean estadoReserva;
    @Column(name = "VALOR")
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;
    /*@ManyToOne
    @JoinColumn(name = "ID_PERSONA")
    private TbaPersona idPersona;*/
}