package com.example.backlavadoraautos.repository;

import com.example.backlavadoraautos.entity.Usuario;
import com.example.backlavadoraautos.entity.Vehiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo, Integer> {
}