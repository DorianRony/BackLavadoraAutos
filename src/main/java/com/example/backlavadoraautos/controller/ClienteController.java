package com.example.backlavadoraautos.controller;

import com.example.backlavadoraautos.entity.Cliente;
import com.example.backlavadoraautos.entity.Usuario;
import com.example.backlavadoraautos.service.ClienteService;
import com.example.backlavadoraautos.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteService clienteService;
    private final UsuarioService usuarioService;

    @GetMapping(path = "/listar", produces = "application/json")
    public List<Cliente> lista() {
        return clienteService.lista();
    }

    @PostMapping(path = "/guardar", produces = "application/json")
    public Cliente guardar(@RequestBody @Validated Cliente cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping(path = "/actualizar", produces = "application/json")
    public void actualizar(@RequestBody @Validated Cliente cliente) {
        clienteService.save(cliente);
    }

    @DeleteMapping(path = "/eliminar", produces = "application/json")
    public void delete(@RequestBody @Validated Cliente cliente) {
        clienteService.delete(cliente);
    }

    @GetMapping(path = "/buscarid/{id}", produces = "application/json")
    public Cliente buscauno(@PathVariable("id") Integer id) {
        return clienteService.findbyId(id);
    }

    @GetMapping(path = "/buscarcedula/{id}", produces = "application/json")
    public Cliente buscaCedula(@PathVariable("id") String cedula) {
        return clienteService.findbyCedula(cedula);
    }

    @GetMapping(path = "/buscarporusuario/{id}", produces = "application/json")
    public Cliente buscaUsuario(@PathVariable("id") int idUsr) {
        return clienteService.findbyUsuario(usuarioService.findbyId(idUsr));
    }
}