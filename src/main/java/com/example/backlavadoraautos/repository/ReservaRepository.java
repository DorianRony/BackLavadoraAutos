package com.example.backlavadoraautos.repository;

import com.example.backlavadoraautos.entity.Cliente;
import com.example.backlavadoraautos.entity.Reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {
    List<Reserva> findByClienteOrderByFechaDesc(Cliente cliente);
}