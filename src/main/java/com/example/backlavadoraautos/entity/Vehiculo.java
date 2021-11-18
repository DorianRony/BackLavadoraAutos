package com.example.backlavadoraautos.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "VEHICULO")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_VEHICULO")
    private Integer idVehiculo;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "MODELO")
    private String modelo;
    @Column(name = "PLACA")
    private String placa;
    @Column(name = "ESTADO_VEHICULO")
    private Boolean estadoVehiculo;
    /*@ManyToOne
    @JoinColumn(name = "ID_SUCURSAL")
    private TbaSucursal idSucursal;
    @ManyToOne
    @JoinColumn(name = "ID_PERSONA")
    private TbaPersona idPersona;*/
}