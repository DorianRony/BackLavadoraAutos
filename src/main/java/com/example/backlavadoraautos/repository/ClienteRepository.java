package com.example.backlavadoraautos.repository;

import com.example.backlavadoraautos.entity.Cliente;
import com.example.backlavadoraautos.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    Cliente findByCedula(String cedula);
    Cliente findByUsuario(Usuario usuario);
}