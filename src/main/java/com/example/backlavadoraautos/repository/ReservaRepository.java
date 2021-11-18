package com.example.backlavadoraautos.repository;

import com.example.backlavadoraautos.entity.Cliente;
import com.example.backlavadoraautos.entity.Reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva, Integer> {
    Reserva findByNumero(String numero);
}