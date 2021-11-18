package com.example.backlavadoraautos.controller;

import com.example.backlavadoraautos.entity.Usuario;
import com.example.backlavadoraautos.entity.Vehiculo;
import com.example.backlavadoraautos.service.UsuarioService;
import com.example.backlavadoraautos.service.VehiculoService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
@RequiredArgsConstructor
public class VehiculoController {
    private final VehiculoService vehiculoService;

    @GetMapping(path = "/listar", produces = "application/json")
    public List<Vehiculo> lista() {
        return vehiculoService.lista();
    }

    @PostMapping(path = "/guardar", produces = "application/json")
    public Vehiculo guardar(@RequestBody @Validated Vehiculo vehiculo) {
        return vehiculoService.save(vehiculo);
    }

    @PutMapping(path = "/actualizar", produces = "application/json")
    public void actualizar(@RequestBody @Validated Vehiculo vehiculo) {
        vehiculoService.save(vehiculo);
    }

    @DeleteMapping(path = "/eliminar", produces = "application/json")
    public void delete(@RequestBody @Validated Vehiculo vehiculo) {
        vehiculoService.delete(vehiculo);
    }

    @GetMapping(path = "/buscarid/{id}", produces = "application/json")
    public Vehiculo buscauno(@PathVariable("id") Integer id) {
        return vehiculoService.findbyId(id);
    }
}