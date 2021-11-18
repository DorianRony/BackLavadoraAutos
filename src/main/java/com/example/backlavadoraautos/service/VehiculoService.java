package com.example.backlavadoraautos.service;

import com.example.backlavadoraautos.entity.Usuario;
import com.example.backlavadoraautos.entity.Vehiculo;
import com.example.backlavadoraautos.repository.UsuarioRepository;
import com.example.backlavadoraautos.repository.VehiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;

    public List<Vehiculo> lista() {
        return (List<Vehiculo>) vehiculoRepository.findAll();
    }

    public Vehiculo findbyId(Integer id) {
        return vehiculoRepository.findById(id).get();
    }

    public Vehiculo save(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    public void delete(Vehiculo tbaUsuario) {
        vehiculoRepository.delete(tbaUsuario);
    }
}