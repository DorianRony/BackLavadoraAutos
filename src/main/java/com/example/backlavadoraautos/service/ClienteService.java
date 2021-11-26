package com.example.backlavadoraautos.service;

import com.example.backlavadoraautos.entity.Cliente;
import com.example.backlavadoraautos.entity.Usuario;
import com.example.backlavadoraautos.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepo;

    public List<Cliente> lista() {
        return (List<Cliente>) clienteRepo.findAll();
    }

    public Cliente findbyId(Integer id) {
        return clienteRepo.findById(id).get();
    }

    public Cliente save(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    public void delete(Cliente cliente) {
        clienteRepo.delete(cliente);
    }

    public Cliente findbyCedula(String cedula) {
        return clienteRepo.findByCedula(cedula);
    }

    public Cliente findbyUsuario(Usuario usuario) {
        return clienteRepo.findByUsuario(usuario);
    }
}