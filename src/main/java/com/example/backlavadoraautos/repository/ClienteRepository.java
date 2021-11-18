package com.example.backlavadoraautos.repository;

import com.example.backlavadoraautos.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    Cliente findByCedula(String cedula);
}