package com.example.backlavadoraautos.controller;

import com.example.backlavadoraautos.entity.Reserva;
import com.example.backlavadoraautos.service.ClienteService;
import com.example.backlavadoraautos.service.ReservaService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
@RequiredArgsConstructor
public class ReservaController {
    private final ReservaService reservaService;
    private final ClienteService clienteService;

    @GetMapping(path = "/listar", produces = "application/json")
    public List<Reserva> lista() {
        return reservaService.lista();
    }

    @PostMapping(path = "/guardar", produces = "application/json")
    public Reserva guardar(@RequestBody @Validated Reserva reserva) {
        return reservaService.save(reserva);
    }

    @PutMapping(path = "/actualizar", produces = "application/json")
    public void actualizar(@RequestBody @Validated Reserva reserva) {
        reservaService.save(reserva);
    }

    @DeleteMapping(path = "/eliminar", produces = "application/json")
    public void delete(@RequestBody @Validated Reserva reserva) {
        reservaService.delete(reserva);
    }

    @GetMapping(path = "/buscarid/{id}", produces = "application/json")
    public Reserva buscauno(@PathVariable("id") Integer id) {
        return reservaService.findbyId(id);
    }

    @GetMapping(path = "/buscarporcliente/{id}", produces = "application/json")
    public List<Reserva> buscaPorCliente(@PathVariable("id") int idCliente) {
        return reservaService.findByCliente(clienteService.findbyId(idCliente));
    }
}