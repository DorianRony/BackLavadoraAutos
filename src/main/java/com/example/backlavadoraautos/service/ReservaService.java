package com.example.backlavadoraautos.service;

import com.example.backlavadoraautos.entity.Cliente;
import com.example.backlavadoraautos.entity.Reserva;
import com.example.backlavadoraautos.repository.ClienteRepository;
import com.example.backlavadoraautos.repository.ReservaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservaService {

    private final ReservaRepository reservaRepo;

    public List<Reserva> lista() {
        return (List<Reserva>) reservaRepo.findAll();
    }

    public Reserva findbyId(Integer id) {
        return reservaRepo.findById(id).get();
    }

    public Reserva save(Reserva cliente) {
        return reservaRepo.save(cliente);
    }

    public void delete(Reserva cliente) {
        reservaRepo.delete(cliente);
    }

    public Reserva findByNumero(String cedula) {
        return reservaRepo.findByNumero(cedula);
    }
}